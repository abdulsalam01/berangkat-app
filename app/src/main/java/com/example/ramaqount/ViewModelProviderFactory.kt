package com.example.ramaqount

import android.os.Build
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException
import java.util.function.Supplier
import javax.inject.Singleton

class ViewModelProviderFactory<T: ViewModel> @Singleton
    constructor(val viewModelClass: Class<T>, val viewModelSupplier: Supplier<T>)
        : ViewModelProvider.NewInstanceFactory() {

    @RequiresApi(Build.VERSION_CODES.N)
    @NonNull
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(viewModelClass)) return viewModelSupplier.get() as T

        throw IllegalArgumentException("Unknown class ${viewModelClass.name}")
    }
}
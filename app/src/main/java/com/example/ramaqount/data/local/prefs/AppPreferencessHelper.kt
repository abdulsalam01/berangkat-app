package com.example.ramaqount.data.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.example.ramaqount.data.local.Const
import com.example.ramaqount.data.model.Rakaat
import javax.inject.Inject

class AppPreferencessHelper @Inject constructor(ctx: Context): PreferencesHelper {

    private val mPref: SharedPreferences =
        ctx.getSharedPreferences(Const.PREF_NAME, Context.MODE_PRIVATE)

    override val attrRakaat: Rakaat
        get() = Rakaat(23, "tarawih")

    override fun setRakaat(rakaat: Rakaat) {
        this.mPref.edit().putInt(Const.PREF_TOTAL_RAKAAT, rakaat.default_rakaat).apply()
    }

    override fun getRakaat(): Rakaat {
        val total = this.mPref.getInt(Const.PREF_TOTAL_RAKAAT, 0)
        val desc = this.mPref.getString(Const.PREF_DESKRIPSI_RAKAAT, null)
        val rakaat = Rakaat(total, desc!!)

        return rakaat
    }
}
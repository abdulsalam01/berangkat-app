package com.example.ramaqount.data.local.prefs

import com.example.ramaqount.data.model.Rakaat

interface PreferencesHelper {
    val attrRakaat: Rakaat

    fun setRakaat(rakaat: Rakaat): Unit
    fun getRakaat(): Rakaat
}
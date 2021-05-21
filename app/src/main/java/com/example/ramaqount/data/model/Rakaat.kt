package com.example.ramaqount.data.model

data class Rakaat(val default_rakaat: Int, val default_description: String) {

    override fun toString(): String {
        return "Total Raka'at: $default_rakaat"
    }
}
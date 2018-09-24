package kiva.com.pe.tutorapp.controllers.models

import android.content.Context
import android.preference.PreferenceManager


class SettingsAccount(val context: Context){

    companion object {
        val didUserLoggedIn = "didUserLoggedIn"
    }
    val preferences = PreferenceManager
            .getDefaultSharedPreferences(context)

    var didUserLoggedIn: Boolean = preferences.getBoolean(SettingsAccount.didUserLoggedIn,false)

    set(value) = preferences.edit().putBoolean(SettingsAccount.didUserLoggedIn,value).apply()

    var shouldUserLoggedIn: Boolean = !didUserLoggedIn

    set(value) {

        shouldUserLoggedIn = !value
    }

}
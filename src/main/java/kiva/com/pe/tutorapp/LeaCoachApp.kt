package kiva.com.pe.tutorapp

import android.app.Application
import com.androidnetworking.AndroidNetworking

class LeaCoachApp: Application(){
    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(getApplicationContext())
    }
}
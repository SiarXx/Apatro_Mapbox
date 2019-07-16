package com.example.apator_mapp

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

class MapboxApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(getApplicationContext(), R.string.mapbox_access_token.toString());
    }
}
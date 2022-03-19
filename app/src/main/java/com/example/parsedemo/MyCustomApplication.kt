package com.example.parsedemo

import android.app.Application
import android.content.res.Configuration
import android.content.res.Resources
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor


class MyCustomApplication: Application() {
    override fun onCreate(){
        super.onCreate()

        val builder: OkHttpClient.Builder =OkHttpClient.Builder()
        val httpLoggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        builder.networkInterceptors().add(httpLoggingInterceptor)
        //Parse Parse.intialize(Resources.getSystem().getString(R.string.clientKey)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }
}
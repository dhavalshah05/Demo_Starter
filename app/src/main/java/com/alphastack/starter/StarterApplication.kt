package com.alphastack.starter

import android.app.Application
import com.alphastack.starter.di.application.AppComponent
import com.alphastack.starter.di.application.AppModule
import com.alphastack.starter.di.application.DaggerAppComponent

class StarterApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}
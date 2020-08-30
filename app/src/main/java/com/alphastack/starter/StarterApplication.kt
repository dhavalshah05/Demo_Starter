package com.alphastack.starter

import android.app.Application
import com.alphastack.starter.di.application.AppComponent
import com.alphastack.starter.di.application.AppModule
import com.alphastack.starter.di.application.DaggerAppComponent
import com.alphastack.starter.utils.logging.ClickableLoggingTree
import timber.log.Timber

class StarterApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        setUpLogging()
    }

    private fun setUpLogging() {
        if (BuildConfig.DEBUG) {
            Timber.plant(ClickableLoggingTree())
        }
    }

}
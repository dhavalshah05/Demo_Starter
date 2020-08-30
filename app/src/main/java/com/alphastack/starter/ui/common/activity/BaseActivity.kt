package com.alphastack.starter.ui.common.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alphastack.starter.StarterApplication
import com.alphastack.starter.di.activity.ActivityComponent
import com.alphastack.starter.di.activity.ActivityModule
import com.alphastack.starter.di.presentation.PresentationComponent
import com.alphastack.starter.di.presentation.PresentationModule

abstract class BaseActivity : AppCompatActivity() {

    val activityComponent: ActivityComponent by lazy {
        val appComponent = (application as StarterApplication).appComponent
        appComponent.newActivityComponent(ActivityModule(this))
    }

    private val presentationComponent: PresentationComponent by lazy {
        activityComponent.newPresentationComponent(PresentationModule())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        injectActivity(presentationComponent)
        super.onCreate(savedInstanceState)
    }

    abstract fun injectActivity(presentationComponent: PresentationComponent)

}
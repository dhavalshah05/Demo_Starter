package com.alphastack.starter.ui

import android.os.Bundle
import com.alphastack.starter.R
import com.alphastack.starter.di.presentation.PresentationComponent
import com.alphastack.starter.ui.common.activity.BaseActivity

class MainActivity : BaseActivity() {

    override fun injectActivity(presentationComponent: PresentationComponent) {
        presentationComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
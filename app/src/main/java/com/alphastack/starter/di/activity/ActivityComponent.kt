package com.alphastack.starter.di.activity

import com.alphastack.starter.di.presentation.PresentationComponent
import com.alphastack.starter.di.presentation.PresentationModule
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent(presentationModule: PresentationModule): PresentationComponent
}
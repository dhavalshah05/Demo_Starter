package com.alphastack.starter.di.application

import com.alphastack.starter.di.activity.ActivityComponent
import com.alphastack.starter.di.activity.ActivityModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent
}
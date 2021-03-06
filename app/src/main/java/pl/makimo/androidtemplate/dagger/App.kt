package pl.makimo.androidtemplate.dagger

import android.app.Application
import timber.log.Timber


class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .androidModule(AndroidModule(this))
            .build()
    }

    init {
        Timber.plant(Timber.DebugTree())
    }
}
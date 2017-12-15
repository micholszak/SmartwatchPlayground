package pl.olszak.michal.smartwatchplayground.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.olszak.michal.smartwatchplayground.di.module.activity.MainActivityModule
import pl.olszak.michal.smartwatchplayground.welcome.WelcomeActivity
import pl.olszak.michal.smartwatchplayground.di.scope.PerActivity

/**
 * @author molszak
 *         created on 08.11.2017.
 */
@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): WelcomeActivity


}
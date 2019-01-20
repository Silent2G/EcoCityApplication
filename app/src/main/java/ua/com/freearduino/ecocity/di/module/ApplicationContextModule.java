package ua.com.freearduino.ecocity.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import ua.com.freearduino.ecocity.di.annotations.ApplicationContext;

@Module
public class ApplicationContextModule {

    Context context;

    public ApplicationContextModule(Context context) {
        this.context = context;
    }

    @ApplicationContext
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }
}

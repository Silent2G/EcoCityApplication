package ua.com.freearduino.ecocity.di.component;

import dagger.Component;
import ua.com.freearduino.ecocity.api.APIService;
import ua.com.freearduino.ecocity.di.module.ApiServiceModule;

@Component(modules = {ApiServiceModule.class})
public interface MainComponent {
    APIService getApiService();
}

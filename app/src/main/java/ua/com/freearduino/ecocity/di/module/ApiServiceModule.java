package ua.com.freearduino.ecocity.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.com.freearduino.ecocity.api.APIService;

@Module(includes = OkHttpClientModule.class)
public class ApiServiceModule {

    @Provides
    public APIService getAPIServiceData(Retrofit retrofit) {
        return retrofit.create(APIService.class);
    }

    @Provides
    public Retrofit retrofit(OkHttpClient okHttpClient,
                             GsonConverterFactory gsonConverterFactory) {

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://freearduino.com.ua/")
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public Gson gson() {
        return new GsonBuilder().create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }
}

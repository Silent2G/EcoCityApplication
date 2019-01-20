package ua.com.freearduino.ecocity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.com.freearduino.ecocity.R;
import ua.com.freearduino.ecocity.api.APIService;
import ua.com.freearduino.ecocity.utils.InternetConnection;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private APIService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // if(InternetConnection.checkConnection(this)) {
            service = getClient("http://freearduino.com.ua/").create(APIService.class);

            getSomeJSON();

      //  }
    }

    private void getSomeJSON() {
        service.getStationsArray().enqueue(new Callback<JSONArray>() {
            @Override
            public void onResponse(Call<JSONArray> call, Response<JSONArray> response) {
                Log.i(TAG, response.toString());
                if(response.isSuccessful()) {
                   // response.body().length()
                }
            }

            @Override
            public void onFailure(Call<JSONArray> call, Throwable t) {

            }
        });
    }

    private Retrofit getClient(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

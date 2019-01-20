package ua.com.freearduino.ecocity.api;

import org.json.JSONArray;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("eco-city/publishingdata/json")
    Call<JSONArray> getStationsArray();

}

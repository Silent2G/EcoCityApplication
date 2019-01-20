package ua.com.freearduino.ecocity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Station {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("cityName")
    @Expose
    private String cityName;

    @SerializedName("stationName")
    @Expose
    private String stationName;

    @SerializedName("localName")
    @Expose
    private String localName;

    @SerializedName("latitude")
    @Expose
    private String latitude;

    @SerializedName("longitude")
    @Expose
    private String longitude;

    @SerializedName("pollutants")
    @Expose
    private ArrayList<Pollutant> pollutants = null;

    public Station(String id, String cityName, String stationName, String localName,
                   String latitude, String longitude, ArrayList<Pollutant> pollutants) {
        this.id = id;
        this.cityName = cityName;
        this.stationName = stationName;
        this.localName = localName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pollutants = pollutants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Pollutant> getPollutants() {
        return pollutants;
    }

    public void setPollutants(ArrayList<Pollutant> pollutants) {
        this.pollutants = pollutants;
    }
}

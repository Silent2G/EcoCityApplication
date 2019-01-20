package ua.com.freearduino.ecocity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pollutant {

    @SerializedName("pol")
    @Expose
    private String pol;

    @SerializedName("unit")
    @Expose
    private String unit;

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("averaging")
    @Expose
    private String averaging;

    public Pollutant(String pol, String unit, String time, String value, String averaging) {
        this.pol = pol;
        this.unit = unit;
        this.time = time;
        this.value = value;
        this.averaging = averaging;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAveraging() {
        return averaging;
    }

    public void setAveraging(String averaging) {
        this.averaging = averaging;
    }

}

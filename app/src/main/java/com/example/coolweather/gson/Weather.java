package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 30971 on 2017/6/15.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Suggestion suggestion;
    public Now now;
    public AQI aqi;

    @SerializedName("daily_forecast")
    public List<Forecast> forecaseList;
}

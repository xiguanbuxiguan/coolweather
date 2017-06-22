package com.example.coolweather.gson;

/**
 * Created by 30971 on 2017/6/15.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

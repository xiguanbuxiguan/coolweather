package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 30971 on 2017/6/15.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

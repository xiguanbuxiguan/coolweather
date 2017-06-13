package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 30971 on 2017/6/13.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCoe;
    private int provinceId;

    public int getId() {
        return id;
    }

    public City setId(int id) {
        this.id = id;
        return this;
    }

    public String getCityName() {
        return cityName;
    }

    public City setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public int getCityCoe() {
        return cityCoe;
    }

    public City setCityCoe(int cityCoe) {
        this.cityCoe = cityCoe;
        return this;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public City setProvinceId(int provinceId) {
        this.provinceId = provinceId;
        return this;
    }
}

package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 30971 on 2017/6/13.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public Province setId(int id) {
        this.id = id;
        return this;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public Province setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public Province setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
}

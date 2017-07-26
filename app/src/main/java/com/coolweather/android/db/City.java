package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 12194 on 2017/7/26.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;   //城市代号
    private int provinceId; //当前市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

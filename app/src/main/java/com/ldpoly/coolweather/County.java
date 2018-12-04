package com.ldpoly.coolweather;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/12/4.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherName;
    private int cityId;

    public String getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }



}

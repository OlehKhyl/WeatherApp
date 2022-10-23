package com.example.weatherapp.cityDataByName;

import java.util.Map;

public class City {
    private String name;
    private Map<String, String> local_names;
    private Double lat;
    private Double lon;
    private String country;

    private String state;

    public City() {
    }

    public City(String name, Map<String, String> local_names, Double lat, Double lon, String country, String state) {
        this.name = name;
        this.local_names = local_names;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getLocal_names() {
        return local_names;
    }

    public void setLocal_names(Map<String, String> local_names) {
        this.local_names = local_names;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

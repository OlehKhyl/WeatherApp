package com.example.weatherapp.weatherService.weather;

import java.util.List;
import java.util.Map;

public class Weather {
    private Double latitude;
    private Double longitude;
    private Double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private Float elevation;
    private CurrentWeather current_weather;

    public Weather() {
    }

    public Weather(Double latitude, Double longitude, Double generationtime_ms, int utc_offset_seconds, String timezone, String timezone_abbreviation, Float elevation, CurrentWeather current_weather) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.generationtime_ms = generationtime_ms;
        this.utc_offset_seconds = utc_offset_seconds;
        this.timezone = timezone;
        this.timezone_abbreviation = timezone_abbreviation;
        this.elevation = elevation;
        this.current_weather = current_weather;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getGenerationtime_ms() {
        return generationtime_ms;
    }

    public void setGenerationtime_ms(Double generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    public int getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public void setUtc_offset_seconds(int utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }

    public void setTimezone_abbreviation(String timezone_abbreviation) {
        this.timezone_abbreviation = timezone_abbreviation;
    }

    public Float getElevation() {
        return elevation;
    }

    public void setElevation(Float elevation) {
        this.elevation = elevation;
    }

    public CurrentWeather getCurrent_weather() {
        return current_weather;
    }

    public void setCurrent_weather(CurrentWeather current_weather) {
        this.current_weather = current_weather;
    }
}

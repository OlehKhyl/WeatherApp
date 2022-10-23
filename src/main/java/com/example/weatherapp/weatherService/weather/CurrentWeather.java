package com.example.weatherapp.weatherService.weather;


public class CurrentWeather {
    private Float temperature;
    private Float windspeed;
    private Float winddirection;
    private int weathercode;
    private String time;

    public CurrentWeather() {
    }

    public CurrentWeather(Float temperature, Float windspeed, Float winddirection, int weathercode, String time) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.weathercode = weathercode;
        this.time = time;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Float windspeed) {
        this.windspeed = windspeed;
    }

    public Float getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(Float winddirection) {
        this.winddirection = winddirection;
    }

    public int getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(int weathercode) {
        this.weathercode = weathercode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

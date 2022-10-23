package com.example.weatherapp.weatherService;

import com.example.weatherapp.weatherService.weather.CurrentWeather;
import com.example.weatherapp.weatherService.weather.Weather;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class OpenMeteoService {

    public static final Map<Integer, String> weatherInterpretationCodes = new HashMap<>();

    static {
        weatherInterpretationCodes.put(0, "Clear sky");
        weatherInterpretationCodes.put(1, "Mainly clear");
        weatherInterpretationCodes.put(2, "Partly cloudy");
        weatherInterpretationCodes.put(3, "Overcast");
        weatherInterpretationCodes.put(45, "Fog");
        weatherInterpretationCodes.put(48, "Depositing rime fog");
        weatherInterpretationCodes.put(51, "Light drizzle");
        weatherInterpretationCodes.put(53, "Moderate drizzle");
        weatherInterpretationCodes.put(55, "Dense drizzle");
        weatherInterpretationCodes.put(56, "Light freezing drizzle");
        weatherInterpretationCodes.put(57, "Dense freezing drizzle");
        weatherInterpretationCodes.put(61, "Slight rain");
        weatherInterpretationCodes.put(63, "Moderate rain");
        weatherInterpretationCodes.put(65, "Heavy rain");
        weatherInterpretationCodes.put(66, "Light freezing rain");
        weatherInterpretationCodes.put(67, "Heavy freezing rain");
        weatherInterpretationCodes.put(71, "Slight snow fall");
        weatherInterpretationCodes.put(73, "Moderate snow fall");
        weatherInterpretationCodes.put(75, "Heavy snow fall");
        weatherInterpretationCodes.put(77, "Snow grains");
        weatherInterpretationCodes.put(80, "Slight rain shower");
        weatherInterpretationCodes.put(81, "Moderate rain shower");
        weatherInterpretationCodes.put(82, "Violent rain shower");
        weatherInterpretationCodes.put(85, "Slight snow shower");
        weatherInterpretationCodes.put(86, "Heavy snow shower");
        weatherInterpretationCodes.put(95, "Slight or moderate thunderstorm");
        weatherInterpretationCodes.put(96, "Thunderstorm with slight hail");
        weatherInterpretationCodes.put(99, "Thunderstorm with heavy hail");



    }
    public static CurrentWeather currentWeather(Double lat, Double lon) throws IOException {
        URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=" + lat + "&longitude=" + lon + "&current_weather=true");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder resultBuilder = new StringBuilder();

        while (reader.ready()) {
            resultBuilder.append(reader.readLine());
        }

        String result = resultBuilder.toString();

        ObjectMapper mapper = new ObjectMapper();

        Weather weather = mapper.readValue(result, new TypeReference<Weather>() {});

        return weather.getCurrent_weather();
    }

    public static String getWindDirectionByDeg(Float deg) {
        String direction = "";

        if (deg >= 348.75 || deg < 11.25) {
            direction = "N";
        } else if (deg >= 11.25 && deg < 33.75) {
            direction = "NNE";
        } else if (deg >= 33.75 && deg < 56.25) {
            direction = "NE";
        } else if (deg >= 56.25 && deg < 78.75) {
            direction = "ENE";
        } else if (deg >= 78.75 && deg < 101.25) {
            direction = "E";
        } else if (deg >= 101.25 && deg < 123.75) {
            direction = "ESE";
        } else if (deg >= 123.75 && deg < 146.25) {
            direction = "SE";
        } else if (deg >= 146.25 && deg < 168.75) {
            direction = "SSE";
        } else if (deg >= 168.75 && deg < 191.25) {
            direction = "S";
        } else if (deg >= 191.25 && deg < 213.75) {
            direction = "SSW";
        } else if (deg >= 213.75 && deg < 236.25) {
            direction = "SW";
        } else if (deg >= 236.25 && deg < 258.75) {
            direction = "WSW";
        } else if (deg >= 258.75 && deg < 281.25) {
            direction = "W";
        } else if (deg >= 281.25 && deg < 303.75) {
            direction = "WNW";
        } else if (deg >= 303.75 && deg < 326.25) {
            direction = "NW";
        } else if (deg >= 326.25 && deg < 348.75) {
            direction = "NNW";
        }

        return direction;
    }
}

package com.example.weatherapp.cityDataByName;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class OpenWeatherMap {
    private static final String APP_ID = "4bb88df04a643b8848d62af5dc6a142e";

    public static Double[] getLatAndLon(String cityName) throws IOException {
        URL url = new URL( "https://api.openweathermap.org/geo/1.0/direct?q=" + cityName + "&appid=" + APP_ID);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder responseBuilder = new StringBuilder();
        while (reader.ready()) {
            responseBuilder.append(reader.readLine());
        }

        String response = responseBuilder.toString();

        ObjectMapper mapper = new ObjectMapper();
        List<City> map = mapper.readValue(response, new TypeReference<List<City>>(){});

        City city = map.get(0);

        Double lat = city.getLat();
        Double lon = city.getLon();
        reader.close();
        connection.disconnect();

        return new Double[] {lat, lon};
    }
}

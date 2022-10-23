<%@ page import="com.example.weatherapp.weatherService.OpenMeteoService" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.weatherapp.cityDataByName.OpenWeatherMap" %>
<%@ page import="com.example.weatherapp.weatherService.weather.CurrentWeather" %><%--
  Created by IntelliJ IDEA.
  User: olegk
  Date: 17.10.2022
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= request.getParameter("city")%></title>
</head>
<body>

            <%
                String cityName = request.getParameter("city");

                Double[] latAndLon = OpenWeatherMap.getLatAndLon(cityName);
                CurrentWeather currentWeather = OpenMeteoService.currentWeather(latAndLon[0], latAndLon[1]);

                PrintWriter writer = response.getWriter();

                writer.print("<h1>");
                writer.print(cityName);
                writer.print("</h1>");

                writer.print("<h1>");
                writer.print(currentWeather.getTemperature() + " *C");
                writer.print("</h1>");

                writer.print("<h1>");
                writer.print("windspeed: " + currentWeather.getWindspeed() + "m/s . Direction: " + OpenMeteoService.getWindDirectionByDeg(currentWeather.getWinddirection()));
                writer.print("</h1>");

                writer.print("<h1>");
                writer.print(OpenMeteoService.weatherInterpretationCodes.get(currentWeather.getWeathercode()));
                writer.print("</h1>");
            %>


<a href="index.jsp">Home</a>
</body>
</html>

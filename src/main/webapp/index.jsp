<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "WeatherApp" %>
</h1>
<br/>
<form action="temp.jsp" method="get">
    <label for="city">City</label>
    <select name="city" id="city">
        <option value="Dnipro">Dnipro</option>
        <option value="Kyiv">Kyiv</option>
        <option value="Lviv">Lviv</option>
        <option value="Odessa">Odessa</option>
        <option value="London">London</option>
        <option value="Paris">Paris</option>
        <option value="Berlin">Berlin</option>
        <option value="New York">New York</option>
        <option value="Los Angeles">Los Angeles</option>
        <option value="Beijin">Beijin</option>
    </select>
    <button type="submit">Weather</button>
</form>
</body>
</html>
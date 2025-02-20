package com.tutorials.unitconverterjava.Services;

import com.tutorials.unitconverterjava.Models.Temperature;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
    public void convertTemperature(Temperature temperature) {
        String from = String.valueOf(temperature.getFrom());
        String to = String.valueOf(temperature.getTo());
        double value = temperature.getValue();

        if (from.equals("Celsius".toUpperCase()) && to.equals("Fahrenheit".toUpperCase())) {
            temperature.setResult((value * 9 / 5) + 32);
        } else if (from.equals("Fahrenheit".toUpperCase()) && to.equals("Celsius".toUpperCase())) {
            temperature.setResult((value - 32) * 5 / 9);
        } else if (from.equals("Celsius".toUpperCase()) && to.equals("Kelvin".toUpperCase())) {
            temperature.setResult(value + 273.15);
        } else if (from.equals("Kelvin".toUpperCase()) && to.equals("Celsius".toUpperCase())) {
            temperature.setResult(value - 273.15);
        } else if (from.equals("Fahrenheit".toUpperCase()) && to.equals("Kelvin".toUpperCase())) {
            temperature.setResult((value - 32) * 5 / 9 + 273.15);
        } else if (from.equals("Kelvin".toUpperCase()) && to.equals("Fahrenheit".toUpperCase())) {
            temperature.setResult((value - 273.15) * 9 / 5 + 32);
        } else {
            temperature.setResult(value);
        }
    }
    public String getMassage(Temperature temperature){
        return temperature.getValue() + " " + temperature.getFrom() + " = "
                + temperature.getResult() + " " + temperature.getTo();
    }
}
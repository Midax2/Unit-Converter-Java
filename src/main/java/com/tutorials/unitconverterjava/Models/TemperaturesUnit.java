package com.tutorials.unitconverterjava.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TemperaturesUnit {
    CELSIUS("C"),
    FAHRENHEIT("F"),
    KELVIN("K");

    private final String name;
}

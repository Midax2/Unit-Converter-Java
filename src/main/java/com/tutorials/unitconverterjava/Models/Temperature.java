package com.tutorials.unitconverterjava.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Temperature implements Unit {
    private TemperaturesUnit from;
    private TemperaturesUnit to;
    private double value;
    private double result;
}

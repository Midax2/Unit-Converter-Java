package com.tutorials.unitconverterjava.Controllers;

import com.tutorials.unitconverterjava.Models.Temperature;
import com.tutorials.unitconverterjava.Models.TemperaturesUnit;
import com.tutorials.unitconverterjava.Services.TemperatureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TemperatureController {

    final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/temperature")
    public String temperature(Model model) {
        model.addAttribute("temperature", new Temperature());
        model.addAttribute("units", TemperaturesUnit.values());
        return "temperature";
    }

    @PostMapping("/submitTemperature")
    public String submitForm(@ModelAttribute Temperature temperature, Model model) {
        temperatureService.convertTemperature(temperature);
        model.addAttribute("message", temperatureService.getMassage(temperature));
        return "temperature";
    }
}

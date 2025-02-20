package com.tutorials.unitconverterjava.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LengthController {
    @GetMapping("/length")
    public String length() {
        return "length";
    }
}

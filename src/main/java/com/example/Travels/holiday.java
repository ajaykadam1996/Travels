package com.example.Travels;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {
    @GetMapping("/holiday")
    public String getData() {return  "Please book your holiday for shimla t 35% discount" ; }
}

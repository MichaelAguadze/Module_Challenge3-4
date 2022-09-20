package com.example.utilityapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@Validated
@RestController
public class CalculatorController {

    public CalculatorController() {
    }

    @RequestMapping(value = "/calculator/divide", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public double divide(@RequestParam int value1, @RequestParam int value2) {
        if (value2 == 0){
            throw new IllegalArgumentException("Cannot divide by Zero!!");
        }
        return value1 / value2;
    }

    @RequestMapping(value = "/calculator/square/{value}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public int square(@PathVariable int value) {
        if (value > 46340){
            throw new IllegalArgumentException("Value specified mut be 46340 or lower");
        }
        return value * value;
    }
}

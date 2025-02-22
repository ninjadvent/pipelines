package com.example.badcodeapp.controller;

import com.example.badcodeapp.service.BadCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadCodeController {

    @GetMapping("/float")
    public String floatExample() {
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        return "0.1 + 0.2 = " + sum;
    }

    @Autowired
    private BadCodeService badCodeService;

    @GetMapping("/nullpointer")
    public String nullPointerExample() {
        String data = badCodeService.getData();
        return data.toUpperCase(); // This will cause a NullPointerException
    }

    @GetMapping("/duplicate")
    public String duplicateCodeExample() {
        // Duplicated code
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        return "0.1 + 0.2 = " + sum;
    }

    @GetMapping("/unused")
    public String unusedVariableExample() {
        String unusedVariable = "This variable is never used";
        return "Unused variable example";
    }

    @GetMapping("/complex")
    public String complexMethodExample() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;
        int h = 80;
        int i = 90;
        int j = 100;

        int result = a + b * c - d / e + f % g - h + i * j;

        if (result > 5000) {
            result -= 1000;
        } else if (result > 2000) {
            result -= 500;
        } else {
            result += 100;
        }

        return "Complex method example: " + result;
    }
}

package com.example.badcodeapp.controller;

import com.example.badcodeapp.service.BadCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadCodeController {

    @GetMapping("/float")
    public String floatExample() {
        return calculateSum(0.1, 0.2, "+");
    }

    @Autowired
    private BadCodeService badCodeService;

    @GetMapping("/nullpointer")
    public String nullPointerExample() {
        String data = badCodeService.getData();
        if (data != null) {
            return data.toUpperCase(); // This will cause a NullPointerException
        } else {
            return "Data is null";
        }
    }

    @GetMapping("/duplicate")
    public String duplicateCodeExample() {
        return calculateSum(0.5, 0.25, "-");
    }

    private String calculateSum(double a, double b, String operation) {
        double result;
        if (operation.equals("+")) {
            result = a + b;
            return a + " + " + b + " = " + result;
        } else {
            result = a - b;
            return a + " - " + b + " = " + result;
        }
    }

    @GetMapping("/unused")
    public String unusedVariableExample() {
        String unusedVariable;
        int a = 5; // Unused variable
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

        int result = performCalculations(a, b, c, d, e, f, g, h, i, j);
        result = adjustResult(result);

        return "Complex method example: " + result;
    }

    private int performCalculations(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        return a + b * c - d / e + f % g - h + i * j;
    }

    private int adjustResult(int result) {
        if (result > 5000) {
            result -= 1000;
        } else if (result > 2000) {
            result -= 500;
        } else {
            result += 100;
        }
        return result;
    }

    @GetMapping("/longmethod")
    public String longMethodExample() {
        // This is a long method with many lines of code
        String result = "";
        result += "This is line 1\n";
        result += "This is line 2\n";
        result += "This is line 3\n";
        result += "This is line 4\n";
        result += "This is line 5\n";
        result += "This is line 6\n";
        result += "This is line 7\n";
        result += "This is line 8\n";
        result += "This is line 9\n";
        result += "This is line 10\n";
        result += "This is line 11\n";
        result += "This is line 12\n";
        result += "This is line 13\n";
        result += "This is line 14\n";
        result += "This is line 15\n";
        result += "This is line 16\n";
        result += "This is line 17\n";
        result += "This is line 18\n";
        result += "This is line 19\n";
        result += "This is line 20\n";
        result += "This is line 21\n";
        result += "This is line 22\n";
        result += "This is line 23\n";
        result += "This is line 24\n";
        result += "This is line 25\n";
        result += "This is line 26\n";
        result += "This is line 27\n";
        result += "This is line 28\n";
        result += "This is line 29\n";
        result += "This is line 30\n";
        return "Long method example: " + result;
    }

    @GetMapping("/magicnumber")
    public String magicNumberExample() {
        double radius = 10.0; // Magic number
        double area = 3.14 * radius * radius; // Another magic number
        return "Magic number example: " + area;
    }
}

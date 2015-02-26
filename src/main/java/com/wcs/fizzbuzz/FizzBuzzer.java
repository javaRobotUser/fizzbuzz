package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 7 == 0 && number % 5 == 0) {
            return "BuzzWizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number > 7 && number % 7 == 0) {
            return "Wizz";
        }
        String num = String.valueOf(number);
        if (num.contains("3")) {
            return "Fizz";
        } else if (num.contains("5")) {
            return "Buzz";
        } else if (number > 7 && num.contains("7")) {
            return "Wizz";
        }
        return String.valueOf(number);
    }

}

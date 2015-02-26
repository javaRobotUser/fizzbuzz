package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        String ret = "";
        if (number % 3 == 0 && number % 5 == 0) {
            ret += "fizzbuzz";
        } else if (number % 3 == 0) {
            ret += "fizz";
        } else if (number % 7 == 0 && number % 5 == 0) {
            ret += "BuzzWizz";
        } else if (number % 5 == 0) {
            ret += "buzz";
        } else if (number > 7 && number % 7 == 0) {
            ret += "Wizz";
        }
        String num = String.valueOf(number);
        if (num.contains("3")) {
            ret += "Fizz";
        }
        if (num.contains("5")) {
            ret += "Buzz";
        }
        if (number > 7 && num.contains("7")) {
            ret += "Wizz";
        }
        if (number == 7 || number == 4 || number == 2 || number == 1) {
            ret = String.valueOf(number);
        }
        return ret;
    }

}

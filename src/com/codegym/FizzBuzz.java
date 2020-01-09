package com.codegym;

public class FizzBuzz {
    public static String Fizz(int num) {
        if (num > 0) {
            if (num % 3 == 0 && num % 5 == 0) {
                return "FizzBuzz";
            } else if (num % 3 == 0) {
                return "Fizz";
            } else if (num % 5 == 0) {
                return "Buzz";
            } else if (num % 3 != 0 || num % 5 != 0){
                return num + " Khong chia het cho 3 va 5";
            }
        }
        return num + " Nho hon 0";
    }

}

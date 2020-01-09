package com.codegym;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizz() {
        int num = -1;

        String protec = "FizzBuzz";

        String result = FizzBuzz.Fizz(num);
        assertEquals(protec,result);
    }
}
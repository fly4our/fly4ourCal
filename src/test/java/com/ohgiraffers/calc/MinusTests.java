package com.ohgiraffers.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusTests {

    @Test
    @DisplayName("5 minus 2 equals 3")
    public void testMinus() {

        Minus minus = new Minus();
        int result = minus.minusTwoNumbers(5, 2);

        Assertions.assertEquals(3, result);

    }

    @Test
    @DisplayName("2 minus -8 equals 2")
    public void testMinus2() {

        Minus minus = new Minus();
        int result = minus.minusTwoNumbers(-8, 2);

        Assertions.assertEquals(-10, result);


    }

}


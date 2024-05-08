package com.ohgiraffers.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaltiflyTest {

    @Test
    @DisplayName("1*2")
    public void MaltiflyTwoNumbers1(){

        Maltifly maltifly = new Maltifly();
        int result = maltifly.MaltiflyTwoNumbers(1,2);

        Assertions.assertEquals(2, result);


    }

    @Test
    @DisplayName("3*5")
    public void MaltiflyTwoNumbers2(){

        Maltifly maltifly = new Maltifly();
        int result = maltifly.MaltiflyTwoNumbers(3,5);

        Assertions.assertEquals(15, result);

    }

}

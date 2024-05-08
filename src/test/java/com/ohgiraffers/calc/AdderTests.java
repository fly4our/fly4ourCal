package com.ohgiraffers.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {

    @Test
    @DisplayName("1,2")
    public void plusnumber(){

        Adder adder = new Adder();
        int result = adder.plusnumbers(1,2);

        Assertions.assertEquals(3,result);

    }

    @Test
    @DisplayName("3,5")
    public void plusnumber2(){


        Adder adder = new Adder();
        int result = adder.plusnumbers(3,5);

        Assertions.assertEquals(8, result);



    }


}

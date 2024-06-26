package com.ohgiraffers.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTests {

    @Test
    @DisplayName("4와 2를 전달했을 때 2가 나오는 지 확인")
    public void testDivision() {

        Division division = new Division();
        int result = division.divideTwoNumbers(4,2);

        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("6과 1을 전달했을 때 6이 나오는 지 확인")
    public void testDivision1() {

        Division division = new Division();
        int result = division.divideTwoNumbers(6,1);

        Assertions.assertEquals(6, result);
    }
}

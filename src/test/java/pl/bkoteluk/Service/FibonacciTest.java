package pl.bkoteluk.Service;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void whenNumberIsEight_shouldReturnTrue() {
        int testNumber = 8;
        boolean expectedResult = true;

        boolean result = fibonacci.isEven(testNumber);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void whenNumbersAreFiveAndEight_shouldReturnThirteen() {
        int testNumberFive = 5;
        int testNumberEight = 8;
        int expectedResult = 13;

        int result = fibonacci.nextFibonacciNumber(testNumberFive, testNumberEight);
        assertThat(result, is(expectedResult));

    }

    @Test
    void whenMaxNumberIsTen_shouldReturnTen() {
        int testMaxNumber = 10;
        int expectedResult = 10;

        int result = fibonacci.sumEvenFromFibonacci(testMaxNumber);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenMaxNumberIsThirtyFive_shouldReturnFortyFour() {
        int testMaxNumber = 35;
        int expectedResult = 44;

        int result = fibonacci.sumEvenFromFibonacci(testMaxNumber);
        assertThat(result).isEqualTo(expectedResult);
    }
}
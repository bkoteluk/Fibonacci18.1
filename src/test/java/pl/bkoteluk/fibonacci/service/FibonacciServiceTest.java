package pl.bkoteluk.fibonacci.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciServiceTest {
    FibonacciService fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new FibonacciService();
    }

    @Test
    void whenNumberIsEight_shouldReturnTrue() {
        int testNumber = 8;
        boolean expectedResult = true;

        boolean result = fibonacci.isEven(testNumber);
        Assertions.assertEquals(expectedResult, result);
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
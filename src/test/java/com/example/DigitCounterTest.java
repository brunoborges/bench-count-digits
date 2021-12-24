package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class DigitCounterTest {

    private void testCounter(Function<Long, Integer> counter) {
        long number = 9;

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, counter.apply(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByBigDecimalPrecision() {
        testCounter(new DigitCounter()::countDigitsByBigDecimalPrecision);
    }

    @Test
    public void test_countDigitsByWhile() {
        testCounter(new DigitCounter()::countDigitsByWhile);
    }

    @Test
    public void test_countDigitsByStringLength() {
        testCounter(new DigitCounter()::countDigitsByStringLength);
    }

    @Test
    public void test_countDigitsByPowersOfTwo() {
        testCounter(new DigitCounter()::countDigitsByPowersOfTwo);
    }

    @Test
    public void test_countDigitsByLogarithmic() {
        testCounter(new DigitCounter()::countDigitsByLogarithmic);
    }

    @Test
    public void test_countDigitsByFor() {
        testCounter(new DigitCounter()::countDigitsByFor);
    }

    @Test
    public void test_countDigitsByDoWhile() {
        testCounter(new DigitCounter()::countDigitsByDoWhile);
    }

    @Test
    public void test_countDigitsByDivision() {
        testCounter(new DigitCounter()::countDigitsByDivision);
    }

    @Test
    public void test_countDigitsByDivideAndConquer() {
        testCounter(new DigitCounter()::countDigitsByDivideAndConquer);
    }

}

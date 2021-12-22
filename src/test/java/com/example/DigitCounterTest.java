package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DigitCounterTest {

    @Test
    public void test_countDigitsByWhile() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByWhile(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByStringLength() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByStringLength(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByPowersOfTwo() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByPowersOfTwo(number));
            number = number * 10L;
        }

    }

    @Test
    public void test_countDigitsByLogarithmic() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByLogarithmic(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByFor() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByFor(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByDoWhile() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByDoWhile(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByDivision() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByDivision(number));
            number = number * 10L;
        }
    }

    @Test
    public void test_countDigitsByDivideAndConquer() {
        long number = 9;
        var digitCounter = new DigitCounter();

        for (int digits = 1; digits <= DigitCounter.MAX_DIGIT_COUNT; digits++) {
            assertEquals(digits, digitCounter.countDigitsByDivideAndConquer(number));
            number = number * 10L;
        }
    }

}

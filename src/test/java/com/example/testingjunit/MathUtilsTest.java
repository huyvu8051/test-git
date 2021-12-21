package com.example.testingjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MathUtilsTest {
    @Test
    public void divide_SixDividedByTwo_ReturnThree() {
        final int expected = 3;

        final int actual = MathUtils.divide(6, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void divide_OneDividedByTwo_ReturnZero() {
        final int expected = 0;

        final int actual = MathUtils.divide(1, 2);

        assertEquals(expected, actual);
    }


    @Test
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class,()->  MathUtils.divide(1, 0));
    }

    @Test
    public void add_SixAddedByTwo_ReturnEight() {
        final int expected = 8;

        final int actual = MathUtils.add(6, 2);

        assertEquals(expected, actual);
    }
}
package com.gmail.dragonhailstone.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    private calculator calculator = new calculator();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}

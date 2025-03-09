package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        System.out.println("Executing testAdd() on thread: " + Thread.currentThread().getId());
        int result = calculator.add(3, 4);
        Assert.assertEquals(result, 7, "Addition failed!");
    }

    @Test
    public void testMultiply() {
        System.out.println("Executing testMultiply() on thread: " + Thread.currentThread().getId());
        int result = calculator.multiply(3, 4);
        Assert.assertEquals(result, 12, "Multiplication failed!");
    }
}

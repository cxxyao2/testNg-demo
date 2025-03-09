package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PowerCalculationTest {
    @Test
    public void testPower() {
        System.out.println("Executing testPower() on thread: " + Thread.currentThread().getId());
        int result = PowerCalculation.power(2,3);
        Assert.assertEquals(result, 8, "Power failed!");
    }
}

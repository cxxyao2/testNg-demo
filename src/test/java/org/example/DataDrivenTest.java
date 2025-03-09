package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenTest {
    @DataProvider(name = "additionData")
    public Object[][] testData() {
        return new Object[][] {
                {2, 3, 5},
                {10, 20, 30},
                {5, 5, 10}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expected) {
        int result = a + b;
        Assert.assertEquals(result, expected, "Addition failed!");
    }
}

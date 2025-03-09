package org.example;

public class PowerCalculation {
    public static int power(int m, int n) {
        int result = 1;
        while (n > 0) {
            result = result * m;
            n = n - 1;
        }
        return result;
    }
}

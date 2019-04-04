package edu.demo;

public class IntUtils {

    private IntUtils() {
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int pow(int number, int pow) {
        return (int) Math.pow(number, pow);
    }

    public static int getRandomInt(int minBound, int maxBount) {
        return (int) (Math.random() * ((maxBount - minBound) + 1)) + minBound;
    }
}

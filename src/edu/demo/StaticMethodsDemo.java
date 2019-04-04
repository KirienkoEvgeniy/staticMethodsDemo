package edu.demo;

public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println(IntUtils.plus(1,2));
        System.out.println(IntUtils.minus(3,2));
        System.out.println(IntUtils.pow(2,3));
        System.out.println(IntUtils.getRandomInt(12, 150));

    }
}

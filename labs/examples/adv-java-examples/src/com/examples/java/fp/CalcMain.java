package com.examples.java.fp;

import java.util.function.*;

public class CalcMain {
    public static void main(String[] args) {

        // Object Oriented Programming style
        CalcOOP calc = new CalcOOP();
        calc.a = 100;
        calc.b = 20;

        System.out.println("100 + 20 = " + calc.add());
        System.out.println("100 - 20 = " + calc.subtract());
        System.out.println("100 * 20 = " + calc.multiply());
        System.out.println("100 / 20 = " + calc.divide());

        calc.a = 500;
        calc.b = 100;

        System.out.println("500 + 100 = " + calc.add());
        System.out.println("500 - 100 = " + calc.subtract());
        System.out.println("500 * 100 = " + calc.multiply());
        System.out.println("500 / 100 = " + calc.divide());

        // Functional Programming style
//        CalcFP calc = new CalcFP();
//
//        System.out.println("100 + 20 = " + calc.add(100, 20));
//        System.out.println("100 - 50 = " + calc.subtract(100, 50));
//        System.out.println("500 * 20 = " + calc.multiply(500, 20));
//        System.out.println("500 / 100 = " + calc.divide(500, 100));

        // Lambda Expression with Custom Functional Interface
//        MathOperation add = (int a, int b) -> a + b;        // parameters w/ data types
//        MathOperation subtract = (a, b) -> a - b;           // parameters w/ data types
//        MathOperation multiply = (a, b) -> {return a * b;}; // expression body w/ return statement
//        MathOperation divide = (a, b) -> {                  // expression body w/ multiple statements
//            System.out.println("Divding " + a + " by " + b);
//            return a / b;
//        };
//
//        System.out.println("100 + 20 = " + add.compute(100, 20));
//        System.out.println("100 - 50 = " + subtract.compute(100, 50));
//        System.out.println("500 * 20 = " + multiply.compute(500, 20));
//        System.out.println("500 / 100 = " + divide.compute(500, 100));

        // Lambda Expression with Standard Functional Interface
//        BiFunction<Integer, Integer, Integer> add = (Integer a, Integer b) -> a + b;        // parameters w/ data types
//        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;           // parameters w/ data types
//        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {return a * b;}; // expression body w/ return statement
//        BiFunction<Integer, Integer, Integer> divide = (a, b) -> {                  // expression body w/ multiple statements
//            System.out.println("Divding " + a + " by " + b);
//            return a / b;
//        };
//
//        Function<Integer, Integer> square = a -> a * a;
//        Predicate<Integer> condition = a -> a > 50;
//        Consumer<String> print = msg -> System.out.println(msg);
//        Supplier<String> greetings = () -> "Welcome to Lambda Expressions!!!";
//
//        System.out.println("100 + 20 = " + add.apply(100, 20));
//        System.out.println("100 - 50 = " + subtract.apply(100, 50));
//        System.out.println("500 * 20 = " + multiply.apply(500, 20));
//        System.out.println("500 / 100 = " + divide.apply(500, 100));
//        System.out.println("100 ^ 2 = " + square.apply(100));
//        System.out.println("25 > 50 = " + condition.test(25));
//        print.accept("Hello Calculator");
//        System.out.println(greetings.get());

    }
}

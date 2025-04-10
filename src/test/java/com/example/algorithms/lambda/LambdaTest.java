package com.example.algorithms.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

// Una lambda expression es una forma más concisa de escribir funciones anónimas (es decir, sin nombre).
// Se usa sobre todos con interfaces funcionales.
class LambdaTest {

    // 1. Write a Java program to implement a lambda expression to find the sum of two integers.
    @Test
    void sumCalculatorLambdaTest() {

        // Implementación sin lambda (clase anónima)
        Lambda.SumCalculator nonLambdaCalculator = new Lambda.SumCalculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int result1 = nonLambdaCalculator.sum(7, 6);
        Assertions.assertEquals(13, result1);

        // Implementación usando expresión lambda
        Lambda.SumCalculator lambdaCalculator = (a, b) -> a + b;
        int result2 = lambdaCalculator.sum(7, 6);
        Assertions.assertEquals(13, result2);
    }


    // 2. Write a Java program to implement a lambda expression to check if a given string is empty.
    @Test
    void checkStringEmptyTest() {
        String string = "";

        // Implementacion sin lambda
        Predicate<String> isEmpty1 = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.isEmpty();
            }
        };
        boolean result = isEmpty1.test(string);
        Assertions.assertTrue(result, "The string should be empty");

        // Implementacion usando lambda
        Predicate<String> isEmpty = (str) -> str.isEmpty();
        result = isEmpty.test(string);
        Assertions.assertTrue(result, "The string should be empty");

        string = "this is another tests no empty";
        result = isEmpty.test(string);
        Assertions.assertFalse(result, "The string should not be empty");
    }

    // 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.


}
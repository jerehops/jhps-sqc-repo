package com.example.app;

public class MainTest {
    public static void main(String[] args) {
        String result = Main.greet("Alice");
        if ("Hello, Alice!".equals(result)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed: " + result);
        }
    }
}

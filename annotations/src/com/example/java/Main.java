package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Animal {
    public void speak() {
    }

    public String getType() {
        return "Generic animal";
    }
}
 class Cat extends Animal {
    @Override
    public void speak() { // This is a good override.
        System.out.println("Meow.");
    }

    //@Override
    public String gettype(int a) { // Compile-time error due to mistyped name.
        return "Cat";
    }
}
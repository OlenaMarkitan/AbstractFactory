package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.DesignPatterns.Creational_Patterns.AbstractFactory.AbstractFactory_tutorialpoints;

// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
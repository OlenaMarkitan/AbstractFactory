package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.DesignPatterns.Creational_Patterns.AbstractFactory.AbstractFactory_tutorialpoints;

// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.domain.entities;

/**
 *
 * @author IngSis
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double x1, double y1,double radius) {
        super(x1,y1);
        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "Circle";
    }
    
    
}

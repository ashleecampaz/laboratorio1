/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.domain.entities;

/**
 *
 * @author Ashlee Campaz
 */
public class Triangle extends Figure{
    
    private double height; 
    private double base;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double height, double base, double side1, double side2, double side3, double x1, double y1) {
        super(x1, y1);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    

    
    @Override
    public double calculateArea() {
        return base*height/2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3; 
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    @Override
    public String toString(){
        return "Triangle";
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.domain.entities;

/**
 *
 * @author IngSis
 */
public abstract class  Figure {
    private double x1;
    private double y1;

    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
}

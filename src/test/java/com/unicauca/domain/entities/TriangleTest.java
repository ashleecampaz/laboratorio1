/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ashlee Campaz
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 4.5*4.0/2;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 3*3;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeight method, of class Triangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 4.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeight method, of class Triangle.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 4.0;
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 4.5;
        double result = instance.getBase();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setBase method, of class Triangle.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 5.0;
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        instance.setBase(base);
        assertEquals(base, instance.getBase(), 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSide1 method, of class Triangle.
     */
    @Test
    public void testGetSide1() {
        System.out.println("getSide1");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 3.0;
        double result = instance.getSide1();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide1() {
        System.out.println("setSide1");
        double side1 = 9.0;
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        instance.setSide1(side1);
        assertEquals(side1, instance.getSide1(), 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSide2 method, of class Triangle.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 3.0;
        double result = instance.getSide2();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2() {
        System.out.println("setSide2");
        double side2 = 4.0;
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        instance.setSide2(side2);
        assertEquals(side2, instance.getSide2(), 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getSide3 method, of class Triangle.
     */
    @Test
    public void testGetSide3() {
        System.out.println("getSide3");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        double expResult = 3.0;
        double result = instance.getSide3();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSide3 method, of class Triangle.
     */
    @Test
    public void testSetSide3() {
        System.out.println("setSide3");
        double side3 = 5.0;
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        instance.setSide3(side3);
        assertEquals(side3, instance.getSide3(), 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangle instance = new Triangle(4.0,4.5,3.0,3.0,3.0,5.0,4.0);
        String expResult = "Triangle";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}


package com.unicauca.domain.entities;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author IngSis
 */
public class CircleTest {
    
    public CircleTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    

    /**
     * Test of calculateArea method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double radius = 1.0;
        Circle instance = new Circle(0,0,1.0);
        double expResult = Math.PI*radius*radius;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(0,0,1.0);
        double radius = 1.0;
        double expResult = 2*radius*Math.PI;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Circle instance =  new Circle(0,0,1.0);
        String expResult = "Circle";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.unicauca.figures;

import com.unicauca.domain.entities.Circle;
import com.unicauca.domain.entities.Figure;
import com.unicauca.domain.entities.Square;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IngSis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probando mi primer vector polimorfico");
        //Crear el array
        List<Figure> myArray = new ArrayList<>();
        
        //Crear las figuras
        Figure fig1 = new Circle(0,0,1.0);
        Figure fig2 = new Circle(10,10,1.12);
        Figure fig3 = new Square(10,10,2.0);
        Figure fig4 = new Square(15,15,4.0);
        
        //Agregar las figuras al array
        myArray.add(fig1);
        myArray.add(fig2);
        myArray.add(fig3);
        myArray.add(fig4);
        
        for (Figure fig: myArray){
            //Aqui estamos probando el polimosfismo, en tiempo de ejecucion
            //Debe ejecutar las versiones de area y perimetro de una figura distinta
            System.out.println(String.format("The %s's Area is: %.2f", fig.toString(), fig.calculateArea()));
            System.out.println(String.format("The %s's Perimeter is: %.2f", fig.toString(), fig.calculatePerimeter()));
        }
        
        
            
    }
    
}

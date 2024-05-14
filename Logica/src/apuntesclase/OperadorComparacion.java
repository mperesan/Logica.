/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesclase;

import java.util.Scanner;

/**
 *
 * @author 207
 */
public class OperadorComparacion {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresa la estatura 1");
        float estatura1 = leer.nextFloat();
         System.out.println("ingresa la estatura 2");
         float estatura2 = leer.nextFloat();
                 
                 boolean comparaEstatura = estatura1 == estatura2;
                 boolean comparaEstatura2 = estatura1 > estatura2;
                 boolean comparaEstatura3 = estatura1 < estatura2;
                 
                 
                 
                 System.out.println("La estatura 1:"+ estatura1 + "es igual a la estatura 2 " + estatura2 + "resultado:" + comparaEstatura);
                  System.out.println("La estatura 1:"+ estatura1 + "es mayor a la estatura 2 " + estatura2 + "resultado:" + comparaEstatura2);
                  System.out.println("La estatura 1:"+ estatura1 + "es menor a la estatura 2 " + estatura2 + "resultado:" + comparaEstatura3);
                 
        
        
        
        
    }
}

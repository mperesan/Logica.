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
public class Claseescaner {
    public static void main(String []args){
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
       
        int num2;
        
       
        
        
        System.out.println("ingrese el primer numero:");
        
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero:"); 
        
        num2 = leer.nextInt();
        int suma = num1 + num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int resta = num1 - num2;
        int modulo = num2 % num1;
                
        System.out.println("El resultado de la suma es:" + suma);
         System.out.println("El resultado de la multiplicacion es:" + mult);
        System.out.println("El resultado de la div es:" + div);
        System.out.println("El resultado de la resta es:" + resta);
        System.out.println("El resultado de la modulo es:" + modulo);
    }
    
}

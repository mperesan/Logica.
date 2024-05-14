/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesclase;

/**
 *
 * @author desarrollo
 */
public class EstructuraWhileAcumulador {
    
    public static void main(String[] args) {
        
        //Imprima los numero de 1 al 10 y sumelos
        
        int i = 0;
        
        int suma = 0;
        
        int lim = 10;
        
        while ( i < 10){
            System.out.println("La suma es " + suma);
            
            System.out.println(i);
            
            i++;
            
            suma = suma+i; // ACUMULADOR
            
            
        }
           
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesclase;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class EstructuraSwitch {
    public static void main(String [] arg) {
        
        Scanner sc = new Scanner(System.in);
        
        int opc;
        
        
    System.out.println("Seleccione de acuerdo al resultado del juego\n"
            + "1. Si gana la casa\n"
            + "2. Si usted gano\n"
            + "3. Si hubo empate");
    
    int Puntoscasa = 500;
    int Puntosclientes = 500;       
    
    opc = sc.nextInt();
    
    switch (opc) {
        
        case 1:
            System.out.println("La  casa gana 100");
            System.out.println("El cliente pierde 100");
            Puntoscasa=Puntoscasa+100;
            Puntosclientes=Puntosclientes-100;
            
            System.out.println("Saldo total casa"+Puntoscasa);
            System.out.println("Saldo total cliente"+Puntosclientes);
            break;
            
        case 2:
            System.out.println("La  casa pierde 100");
            System.out.println("El cliente gana 100");
            Puntoscasa=Puntoscasa-100;
            Puntosclientes=Puntosclientes+100;
            
            System.out.println("Saldo total casa"+Puntoscasa);
            System.out.println("Saldo total cliente"+Puntosclientes);
            break;
            
         case 3:
            System.out.println("Empate, vuelve y juega");
            break;
            
         default:
            System.out.println("Ingrese un valor valido");
            break;
    }
    
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}

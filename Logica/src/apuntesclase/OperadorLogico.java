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
public class OperadorLogico {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        String mailAlmacenado = "Pepito@gmail.com";
        int passwordAlmacenado = 1234;
        System.out.println("Ingrese su usuario: ");
        
        String mailIngresado = leer.nextLine();
        System.out.println("Ingrese su clave: ");
        int passwordIngresado = leer.nextInt();
        if (mailIngresado.equals(mailAlmacenado)&& (passwordAlmacenado == passwordIngresado)){
            System.out.println("Los correos son iguales y las contrasenas tambien");
    
        }
    }
}
    

    


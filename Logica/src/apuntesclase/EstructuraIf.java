/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesclase;

/**
 *
 * @author desarrollo
 */
public class EstructuraIf {
    public static void main(String [] arg) {
        

//If - Simple

int num1 = (int) (Math.random() *11); 
int num2 = (int) (Math.random() *11);

if(num1 >= num2){
    
    System.out.println("El numero " + num1 + " es mayor a " + num2);
}

//Vamos a probar dos caminos

if(num1 >= num2){
    
     System.out.println("El numero " + num1 + " es mayor a " + num2);
     
}else{
    
    System.out.println("El numero 1 no es mayor");
}

//El cliente hizo un cambio en la logica del negocio

if(num1 > num2){
    
     System.out.println("La casa paga");
     
}else if(num1 < num2){
    
    System.out.println("El cliente paga");
    
}else if(num1 == num2){
    
     System.out.println("Empate, vuelve y juega");

}else{
    
    System.out.println("Imgrese un valor valido");
}
    
}







}
    
    
    


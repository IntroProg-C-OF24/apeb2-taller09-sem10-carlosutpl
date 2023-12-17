/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller09;

/**
 *
 * @author Carlos Sánchez
 */
public class Arreglo2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int sumaArreglo = 0;
        
        //Sacar el promedio:
        for(int numero : arreglo)
            sumaArreglo += numero;    
        
        int promedio = sumaArreglo / arreglo.length;
        
        //Indicar los que son por encima de la media:
        int numerosMayorALaMedia = 0;
        int numerosMenorALaMedia = 0;
        
        //System.out.println(promedio); esto era una prueba 
         for(int numero : arreglo){
             
             if(numero > promedio){
                 System.out.println(numero + " está por encima de la media");
                 numerosMayorALaMedia++;
                 continue;
             }
                 
             if(numero < promedio){
                 System.out.println(numero + " está por debajo de la media");
                 numerosMenorALaMedia++;
                 continue;
             }
             
             System.out.println(numero + " es un número igual al promedio");
         }
         
         System.out.println("El total de numeros mayor a la media es de: " + numerosMayorALaMedia);
         System.out.println("El total de números menor a la media es de: " + numerosMenorALaMedia);
    }
}

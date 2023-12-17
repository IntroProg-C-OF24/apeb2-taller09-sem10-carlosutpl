package taller09;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class MarcasVehiculos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de marca de vehículos que va a registrar: ");
        int cantidadVehiculos = sc.nextInt();
        sc.nextLine();
        
        String vehiculosArray[] = new String[cantidadVehiculos];
        String marcaVehiculoActual = "";
        for (int i = 0; i < vehiculosArray.length; i++) {
            System.out.println("Ingrese el nombre de la marca para el auto N." + (i + 1));
            marcaVehiculoActual = sc.nextLine();

            if (marcaVehiculoActual.startsWith("A")
                    || marcaVehiculoActual.startsWith("C")
                    || marcaVehiculoActual.startsWith("T")) {
                System.out.println("Marca no VÁLIDA. Intente nuevamente");
                i--; //Invalidar esta iteración en el bucle.
                continue; //Salir del bucle solo por esta iteración
            }
              vehiculosArray[i] = marcaVehiculoActual;
       
        }
        
        //Imprimir las marcas:
        System.out.println("-----MARCAS-----");
        for(String marcaVehiculo : vehiculosArray){
            System.out.println("Marca: " + marcaVehiculo);
        }

    }

}

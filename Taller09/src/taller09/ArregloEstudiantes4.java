
package taller09;
import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class ArregloEstudiantes4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra en MAYÚSCULA");
            inicial = sc.nextLine();
            
            for(String estudianteActual : estudiantes){
                //Comparar la primera letra del estudiante actual con la letra dada para el usuario
                if(inicial.equalsIgnoreCase(estudianteActual.substring(0,1))){
                    bandera = false;
                    System.out.println("La letra coincidió");
                }
            }
        }
    }
}

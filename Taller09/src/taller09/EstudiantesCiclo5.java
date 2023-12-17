package taller09;

/**
 *
 * @author Carlos Sánchez
 */
public class EstudiantesCiclo5 {

    public static void main(String[] args) {
        double notas[] = new double[28];
        double promedioTotal = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            promedioTotal += notas[i];
        }

        double calificacionAlta = notas[0];
        double calificacionBaja = notas[0];
        String nombreCalfAlta = "";
        String nombreCalfBaja = "";

        promedioTotal = promedioTotal / notas.length;
        System.out.printf("El PROMEDIO del paralelo C es de: %.2f \n", +promedioTotal);

        System.out.println("--------NOTAS POR ENCIMA Y DEBAJO DEL PROMEDIO------");
        for (int i = 0; i < notas.length; i++) {
            double notaActual = notas[i];

            if (notaActual > promedioTotal) {
                System.out.printf("Estudiante " + (i + 1) + " tiene nota por encima del promedio --> %.2f \n", notaActual);
            } else if (notaActual < promedioTotal) {
                System.out.printf("Estudiante " + (i + 1) + " tiene nota por debajo del promedio --> %.2f \n", notaActual);
            }

            if (calificacionAlta < notaActual) {
                calificacionAlta = notaActual;
                nombreCalfAlta = "Estudiante " + (i + 1);
            }
            if (calificacionBaja > notaActual) {
                calificacionBaja = notaActual;
                nombreCalfBaja = "Estudiante " + (i + 1);
            }
        }

        System.out.println("------------");
        System.out.printf("El estudiante con al calificación más alta fue: " 
                + nombreCalfAlta + " con una nota de: %.2f \n", calificacionAlta);
        
        
        System.out.printf("El estudiante con al calificación más baja fue: " 
                + nombreCalfBaja + " con una nota de: %.2f \n", calificacionBaja);
    }
}

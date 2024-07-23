/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.PuertaCoche;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos de la puerta
        System.out.println("Introduce la descripción de la puerta:");
        String descripcion = scanner.nextLine();

        System.out.println("Introduce el peso de la puerta:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada no válida. Por favor, introduce un número para el peso:");
            scanner.next(); // Limpiar la entrada incorrecta
        }
        double peso = scanner.nextDouble();

        System.out.println("Introduce el coste de la puerta:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada no válida. Por favor, introduce un número para el coste:");
            scanner.next(); // Limpiar la entrada incorrecta
        }
        double coste = scanner.nextDouble();

        // Limpiar el salto de línea pendiente después de leer un número
        scanner.nextLine();

        // Crear una instancia de PuertaCoche
        PuertaCoche miPuerta = new PuertaCoche(descripcion, peso, coste);

        int opcion;
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Abrir puerta");
            System.out.println("2. Cerrar puerta");
            System.out.println("3. Bloquear puerta");
            System.out.println("4. Desbloquear puerta");
            System.out.println("5. Activar alarma");
            System.out.println("6. Desactivar alarma");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, selecciona una opción válida:");
                scanner.next(); // Limpiar la entrada incorrecta
            }
            opcion = scanner.nextInt();

            // Limpiar el salto de línea pendiente después de leer un número
            scanner.nextLine();

            if (opcion == 1) {
                miPuerta.abrir();
            } else if (opcion == 2) {
                miPuerta.cerrar();
            } else if (opcion == 3) {
                miPuerta.bloquea();
            } else if (opcion == 4) {
                miPuerta.desbloquea();
            } else if (opcion == 5) {
                miPuerta.activarAlarma();
                System.out.println("Alarma activada: " + miPuerta.alarmaActivada());
            } else if (opcion == 6) {
                miPuerta.desactivarAlarma();
                System.out.println("Alarma activada: " + miPuerta.alarmaActivada());
            } else if (opcion == 7) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}

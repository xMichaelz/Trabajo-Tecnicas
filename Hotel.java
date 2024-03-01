
package com.mycompany.hotelfollowers;

import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el nombre del empleado:");
            
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el turno de trabajo del empleado:");
            String turnoTrabajo = scanner.nextLine();

            Empleado empleado = new Empleado(nombre, turnoTrabajo);
            empleados.add(empleado);

            System.out.println("¿Desea agregar otro empleado? (S/N)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
}

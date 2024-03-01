package com.mycompany.hotelfollowers;

import java.util.Scanner;

public class Lectura {
    Scanner sc = new Scanner(System.in);
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.println(mensaje+": ");
        String dato = sc.next();
        return dato;
    }
    public double leerDouble(String mensaje){
        System.out.println(mensaje);
        double dato = sc.nextDouble();
        return dato;
    }
    public float leerFloat(String mensaje){
        System.out.println(mensaje);
        float dato = sc.nextFloat();
        return dato;
    } 
    
    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje +" debe ser número entero positivo: ");
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Digita la edad del bebe en meses: ");
            }
            dato = sc.nextInt();
            if(dato > 24){
                System.out.println("Es inhumano trabajar más de 24 horas...");
            }else if(dato <= 0){
                System.out.println("Valor no válido");
            }
                
        } while (dato <= 0);
       // System.out.println("La edad ingresada como entero positivo es : " + dato);
        return dato;
    }
}

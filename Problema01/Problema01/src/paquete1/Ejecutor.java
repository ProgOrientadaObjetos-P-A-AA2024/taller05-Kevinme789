/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Estudiante;

/**
 *
 * @author kevin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        String nombre;
        double c1;
        double c2;
        double c3;
        System.out.println("Ingrese opcion [1] o [2]");
        opc = sc.nextInt();
        sc.nextLine();
        switch (opc) {
            case 1:
                System.out.println("Ingrese Nombre de el Estudiante:");
                nombre = sc.nextLine();
                System.out.println("Ingrese Calificacion de materia 1:");
                c1 = sc.nextDouble();
                System.out.println("Ingrese Calificacion de materia 2:");
                c2 = sc.nextDouble();
                Estudiante estudiante1 = new Estudiante(nombre, c1, c2);
                estudiante1.establecerPromedioC();
                System.out.printf("%s", estudiante1);
                break;
            case 2:
                System.out.println("Ingrese Nombre de el Estudiante:");
                nombre = sc.nextLine();
                System.out.println("Ingrese Calificacion de materia 1:");
                c1 = sc.nextDouble();
                System.out.println("Ingrese Calificacion de materia 2:");
                c2 = sc.nextDouble();
                System.out.println("Ingrese Calificacion de materia 3:");
                c3 = sc.nextDouble();
                Estudiante estudiante2 = new Estudiante(nombre, c1, c2, c3);
                estudiante2.establecerPromedioC();
                System.out.printf("%s", estudiante2);
                break;
            default:
                System.out.println("--Opcion no valida--");
                break;
        }

    }

}

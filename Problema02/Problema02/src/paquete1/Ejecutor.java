/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Automotor;

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
        int cedula;
        String marca;
        String cadena = "";
        int anoF;
        double valor;
        System.out.println("Ingrese la cantidad de automotores");
        opc = sc.nextInt();
        for (int i = 0; i < opc; i++) {
            System.out.println("Ingrese la cedula del dueño:");
            cedula = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = sc.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            anoF = sc.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valor = sc.nextDouble();
            Automotor automotor1 = new Automotor(cedula, marca, anoF, valor);
            automotor1.establecerValorMat();
            cadena = String.format("%s\n%s", cadena, automotor1);

        }
        System.out.println(cadena);
    }

}

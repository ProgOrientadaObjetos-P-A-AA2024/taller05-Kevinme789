/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Automotor;

/**
 *
 * @author kevin
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean opc = true;
        int num;
        int cedula;
        String marca;
        String cadena = "";
        int anoF;
        double valor;
        while (opc == true) {
            System.out.println("Ingrese la cedula del dueño:");
            cedula = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = sc.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            anoF = sc.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valor = sc.nextDouble();
            sc.nextLine();
            Automotor automotor1 = new Automotor(cedula, marca, anoF, valor);
            automotor1.establecerValorMat();
            cadena = String.format("%s\n%s", cadena, automotor1);
            System.out.println("Ingrese [0] para no ingresar otro automotor");
            num = sc.nextInt();
            if (num == 0) {
                opc = false;
            }

        }
        System.out.println(cadena);
    }
}

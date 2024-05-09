/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author kevin
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String n, double c1, double c2) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
    }

    public Estudiante(String n, double c1, double c2, double c3) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerC1(double c1) {
        calificacion1 = c1;
    }

    public void establecerC2(double c2) {
        calificacion2 = c2;
    }

    public void establecerC3(double c3) {
        calificacion1 = c3;
    }

    public void establecerPromedioC() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerC1() {
        return calificacion1;
    }

    public double obtenerC2() {
        return calificacion2;
    }

    public double obtenerC3() {
        return calificacion3;
    }

    public double obtenerPromedioC() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("--Calificaciones--\nNombre del Estudiante:"
                + " %s\nCalificacion de materia 1: %.2f\nCalificacion de materia 2"
                + ": %.2f\nCalificacion de materia 3: %.2f\nPromedio de "
                + "Calificaciones: %.2f\n", nombre, calificacion1, calificacion2,
                calificacion3, promedio);
        return cadena;
    }

}

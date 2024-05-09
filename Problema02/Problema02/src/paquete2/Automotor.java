/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author kevin
 */
public class Automotor {

    private int cedula;
    private String marca;
    private int anoFabricacion;
    private double valorVeh;
    private double valorMat;

    public Automotor(int c, String m, int a, double v) {
        cedula = c;
        marca = m;
        anoFabricacion = a;
        valorVeh = v;

    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnoFabricacion(int n) {
        anoFabricacion = n;
    }

    public void establecerValorVeh(double v) {
        valorVeh = v;
    }

    public void establecerValorMat() {
        valorMat = (valorVeh * 0.00002) * (2024 - anoFabricacion);
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnoFabricacion() {
        return anoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVeh;
    }

    public double obtenerValorMat() {
        return valorMat;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula del dueño: %d\nMarca de vehiculo: "
                + "%s\nAño de fabricacion: %d\nValor de Vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n", cedula, marca, anoFabricacion,
                valorVeh, valorMat);
        return cadena;
    }
}

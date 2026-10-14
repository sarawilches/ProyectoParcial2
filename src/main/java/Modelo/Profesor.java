/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalDate;

/**
 *
 * @author sara
 */
public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioHora;
    private int horasDictadas;

    public Profesor(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, 
                    String cedula, String area, double salarioHora, int horasDictadas) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasDictadas = horasDictadas;
    }

    
    public double calcularPagoTotal() {
        double pagoBase = this.salarioHora * this.horasDictadas;
        return pagoBase + (pagoBase * 0.30);
    }

    
    public double calcularPrestaciones() {
        return calcularPagoTotal() * 0.19;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }
}

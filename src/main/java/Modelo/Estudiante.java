/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sara
 */
import java.time.LocalDate;

public class Estudiante extends Persona {
    private String codigo;
    private String grado;

    public Estudiante(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String codigo, String grado) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.grado = grado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}

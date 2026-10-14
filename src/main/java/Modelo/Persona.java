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

public class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected LocalDate fechaNacimiento;
    
public Persona (String nombre, String direccion, String telefono, LocalDate fechaNacimiento){
   this.nombre = nombre;
   this.direccion = direccion; 
   this.telefono = telefono;
   this.fechaNacimiento = fechaNacimiento;
   
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
        return nombre + " | Dirección: " + direccion + " | Teléfono: " + telefono
                + " | Nacimiento: " + fechaNacimiento;
    }
}
 

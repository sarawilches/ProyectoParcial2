/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author sara
 */
public class Colegio {
    private Profesor[] susProfesores;
    private Estudiante[] susEstudiantes;
    private int contadorProfesores;
    private int contadorEstudiantes;

    public Colegio() {
        susProfesores = new Profesor[50];
        susEstudiantes = new Estudiante[100];
        contadorProfesores = 0;
        contadorEstudiantes = 0;
    }

    public void agregarProfesor(Profesor p) {
        if (contadorProfesores < susProfesores.length) {
            susProfesores[contadorProfesores] = p;
            contadorProfesores++;
        }
    }

    public void agregarEstudiante(Estudiante e) {
        if (contadorEstudiantes < susEstudiantes.length) {
            susEstudiantes[contadorEstudiantes] = e;
            contadorEstudiantes++;
        }
    }


    public String reporteEstudiantes() {
        String reporte = "REPORTE DE ESTUDIANTES \n";
        for (int i = 0; i < contadorEstudiantes; i++) {
            Estudiante e = susEstudiantes[i];
            reporte += "Código: " + e.getCodigo() + 
                       " | Nombre: " + e.getNombre() + 
                       " | Grado: " + e.getGrado() + "\n";
        }
        return reporte;
    }

   
    public String reporteProfesores() {
        if (contadorProfesores == 0) return "No hay profesores registrados.";

      
        Profesor[] prodsActivos = Arrays.copyOf(susProfesores, contadorProfesores);

       
        Arrays.sort(prodsActivos, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor p1, Profesor p2) {
                double total1 = p1.calcularPagoTotal() + p1.calcularPrestaciones();
                double total2 = p2.calcularPagoTotal() + p2.calcularPrestaciones();
                return Double.compare(total2, total1); 
            }
        });

        String reporte = "REPORTE DE PROFESORES (Ordenados por Salario Total)\n";
        for (int i = 0; i < prodsActivos.length; i++) {
            Profesor p = prodsActivos[i];
            double pagoTotal = p.calcularPagoTotal();
            double prestaciones = p.calcularPrestaciones();
            double netoConPrestaciones = pagoTotal + prestaciones;

            reporte += "Profesor: " + p.getNombre() + 
                       " | Área: " + p.getArea() + 
                       " | Pago Total: $" + pagoTotal + 
                       " | Prestaciones (19%): $" + prestaciones + 
                       " | Total General: $" + netoConPrestaciones + "\n";
        }
        return reporte;
    }

    public Profesor[] getSusProfesores() {
        return susProfesores;
    }

    public void setSusProfesores(Profesor[] susProfesores) {
        this.susProfesores = susProfesores;
    }

    public Estudiante[] getSusEstudiantes() {
        return susEstudiantes;
    }

    public void setSusEstudiantes(Estudiante[] susEstudiantes) {
        this.susEstudiantes = susEstudiantes;
    }
}

package org.example.excursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excursion {
   private String nombre_actividad;
   private String localidad;
   private double precio;
   private List<String> profesores;
   private List<Estudiante> listaAsistentes;

   static Scanner sc = new Scanner(System.in);

   public Excursion(String nombre_actividad, String localidad, double precio) {
       this.nombre_actividad = nombre_actividad;
       this.localidad = localidad;
       this.precio = precio;
       profesores = new ArrayList<>();
       listaAsistentes = new ArrayList<>();
   }

   public void addListaAsistentes() {
       listaAsistentes.add(new Estudiante());
   }

   public void verAsistentes(){
       int lista = 0;
       for (Estudiante estudiante : listaAsistentes){
           System.out.println("["+lista+"]. " + estudiante.getCurso() + ", " + estudiante.getNombre() + "("+ estudiante.getEdad()+").");
       }
   }

   public void eliminarAsistentesPorEdad(int edad){
       for (Estudiante estudiante : listaAsistentes){
           if (estudiante.getEdad() < edad){
               listaAsistentes.remove(estudiante);
           }
       }
   }

    public void insertarProfesor() {
        System.out.println("Introduce el nombre del profesor/a para la excursión " + nombre_actividad);
        profesores.add(sc.nextLine());
        System.out.println("Profesor añadido correctamente a la excursión " + nombre_actividad);
    }

    public void inscribirAsistente() {
       addListaAsistentes();
    }

    public String getNombre_actividad() {
       return nombre_actividad;
    }

    public String getLocalidad() {
       return localidad;
    }

    public String calcularImporteIngreso() {
       return "no lo se aún";
    }
}

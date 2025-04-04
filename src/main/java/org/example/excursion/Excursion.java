package org.example.excursion;

public class Excursion {
   private String nombre_actividad;
   private String localidad;
   private double precio;
   private Coleccion<String> profesores;
   private Coleccion<Estudiante> listaAsistentes;

   public Excursion(String nombre_actividad, String localidad, double precio) {
       this.nombre_actividad = nombre_actividad;
       this.localidad = localidad;
       this.precio = precio;
   }
}

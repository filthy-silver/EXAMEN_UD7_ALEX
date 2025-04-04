package org.example.excursion;

import java.util.Objects;
import java.util.Scanner;

public class Estudiante {
    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    static Scanner sc = new Scanner(System.in);

    public Estudiante() {
        crearEstudiante();
    }

    private void crearEstudiante() {
        System.out.println("Creando estudiante...\nInserta los apellidos:");
        this.apellidos = sc.nextLine();
        System.out.println("Inserta el nombre:");
        this.nombre = sc.nextLine();
        System.out.println("Inserta el curso:");
        this.curso = sc.nextLine();
        System.out.println("Inserta el edad:");
        this.edad = sc.nextInt();
        sc.nextLine();
        System.out.println(this);
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return Objects.equals(curso, estudiante.curso) &&
                nombre.equals(estudiante.nombre) &&
                apellidos.equals(estudiante.apellidos);
    }

    @Override
    public String toString(){
        return curso + " " + apellidos + " del curso " + curso + " ";
    }

    public String getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }
}


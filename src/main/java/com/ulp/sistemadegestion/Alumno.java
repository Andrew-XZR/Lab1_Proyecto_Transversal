package com.ulp.sistemadegestion;

import java.time.LocalDate;

public class Alumno {
    private int id;
    private int dni;
    private String nombre;
    private LocalDate fecNac;
    private boolean activo;

    public Alumno(int id, int dni, String nombre, LocalDate fecNac, boolean activo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

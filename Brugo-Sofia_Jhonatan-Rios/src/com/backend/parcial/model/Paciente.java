package com.backend.parcial.model;

import java.util.Date;

public class Paciente {

    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private Date fechaDeIngreso;
    private Domicilio Domicilio;

    public Paciente(String nombre, String apellido, int dni, Date fechaDeIngreso, Domicilio domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeIngreso = fechaDeIngreso;
        this.Domicilio = domicilio;
    }

    public Paciente(int id, String nombre, String apellido, int dni, Date fechaDeIngreso, Domicilio domicilio){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeIngreso = fechaDeIngreso;
        this.Domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public com.backend.parcial.model.Domicilio getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(com.backend.parcial.model.Domicilio domicilio) {
        Domicilio = domicilio;
    }
}

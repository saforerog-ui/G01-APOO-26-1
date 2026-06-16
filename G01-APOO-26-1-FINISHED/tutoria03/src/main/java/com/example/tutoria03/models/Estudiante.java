package com.example.tutoria03.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    /**
     * Entidad Estudiante que representa la tabla 'estudiante'.
     * Contiene los campos básicos y sus getters/setters.
     */

    @Id
    private int id;
    private String nombres;
    private String correo;
    private String numeroTelefono;
    private String carrera;
    private String direccion;
    private String semestre;
    private boolean activo;

    // methods 
    /** Devuelve el id del estudiante. */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    /** Devuelve los nombres del estudiante. */
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    /** Devuelve el correo electrónico del estudiante. */
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /** Devuelve el número de teléfono del estudiante. */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    /** Devuelve la carrera del estudiante. */
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /** Devuelve la dirección del estudiante. */
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /** Devuelve el semestre del estudiante. */
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    /** Indica si el estudiante está activo. */
    public boolean isActivo() {
        return activo;
    }
    /** Marca el estudiante como activo/inactivo. */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

}

package com.BibliotecaPrueba.Api.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "socios")
public class Socio {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_socio")
    private Long idSocio;

    @Column (name = "dni", nullable = false, unique = true, length = 9)
    private String dni;

    @Column (name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column (name = "apellidos", nullable = false, length = 40)
    private String apellidos;

    @Column (name = "telefono", length = 14)
    private String telefono;

    @Column (name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column (name = "fechaAlta", nullable = false)
    private LocalDate fechaAlta;

    public Socio() {
    }

    public Long getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Long idSocio) {
        this.idSocio = idSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    
}

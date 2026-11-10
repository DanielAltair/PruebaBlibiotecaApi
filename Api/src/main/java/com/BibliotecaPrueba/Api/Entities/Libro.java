package com.BibliotecaPrueba.Api.Entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity 
@Table (name = "libros")
public class Libro {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_libbro")
    private Long idLibro;

    @Column (name = "isbn", unique = true, nullable = false, length = 20)
    private Integer isbn;

    @Column (name = "titulo", nullable = false, length = 20)
    private String titulo;

    @Column (name = "autor", nullable = false, length = 20)
    private String autor;

    @Column (name = "fecha_publicacion", length = 20)
    private LocalDate fechaPublicacion;

    @Column (name = "genero", length = 20)
    private String genero;

    @Column (name = "disponible")
    private boolean disponible;

    public Libro() {
    }

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}

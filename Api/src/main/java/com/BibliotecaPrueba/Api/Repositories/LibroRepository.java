package com.BibliotecaPrueba.Api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BibliotecaPrueba.Api.Entities.Libro;

import java.util.Optional;


public interface LibroRepository extends JpaRepository<Libro, Long> {

    //Buscar por UK
    Optional<Libro> findByIsbn(Integer isbn);
    //Comprobar si existe por UK
    boolean existsByIsbn(Integer isbn);
    //Eliminar por UK
    void deleteByIsbn(Integer isbn);
} 

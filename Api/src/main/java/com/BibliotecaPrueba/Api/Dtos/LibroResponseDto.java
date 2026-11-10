package com.BibliotecaPrueba.Api.Dtos;

import java.time.LocalDate;

public record LibroResponseDto(

    Long idLibro,
    Integer isbn,
    String titulo,
    String autor,
    LocalDate fechaPublicacion,
    String genero,
    boolean disponible
) {}

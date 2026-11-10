package com.BibliotecaPrueba.Api.Dtos;

import java.time.LocalDate;

public record SocioResponseDto(
    Long idSocio,
    String dni,
    String nombre,
    String apellidos,
    String telefono,
    String email,
    LocalDate fechaAlta
) 
{}

package com.BibliotecaPrueba.Api.Dtos;

import java.time.LocalDate;

public record SocioRequestDto(
    String dni,
    String nombre,
    String apellidos,
    String telefono,
    String email,
    LocalDate fechaAlta
) 
{}

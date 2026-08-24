package com.pipecoding.orteg.model.dto;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor // <- Esta es la línea clave que soluciona el error 500
@AllArgsConstructor
@ToString
@Builder
public class ClienteDto implements Serializable {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;

}

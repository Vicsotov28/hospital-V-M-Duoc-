package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 15, nullable = false)
    private String run;

    @Column(nullable = false)
    private String nombres;  // Luego cambiaremos a "nombres"

    @Column(nullable = false)
    private String apellidos; // Luego cambiaremos a "apellidos"

    @Column(nullable = true)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private String correo;
}

package com.example.demo.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PessoalModel {

    private String nome;
    private int idade;
    private String sexo;
    private String estadoCivil;
    private String profissao;
}
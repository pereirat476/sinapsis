package br.com.sinapsis.projeto.models;

import lombok.*;

@Setter
@Getter
@Builder
public class RedeMT {

    private Integer id;
    private String codigo;
    private String nome;
    private Double tensaoNominal;

}

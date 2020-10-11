package br.com.sinapsis.projeto.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SubEstacao {
    private Integer id;
    private String codigo;
    private String nome;
    private String latitude;
    private String longitude;
    private List<RedeMT> listaRedesMT;
}

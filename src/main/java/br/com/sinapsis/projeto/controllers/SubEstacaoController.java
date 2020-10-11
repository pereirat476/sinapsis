package br.com.sinapsis.projeto.controllers;

import br.com.sinapsis.projeto.models.SubEstacao;
import br.com.sinapsis.projeto.services.SubEstacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/subestacao")
public class SubEstacaoController {

    @Autowired
    private SubEstacaoService service;

    @GetMapping
    public ResponseEntity<List<SubEstacao>> obterListaSubstacoes() {
        return ResponseEntity.ok(service.obterListaSubstacoes());
    }
}

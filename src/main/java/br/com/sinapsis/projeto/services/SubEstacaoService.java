package br.com.sinapsis.projeto.services;

import br.com.sinapsis.projeto.models.SubEstacao;
import br.com.sinapsis.projeto.repositorys.SubEstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubEstacaoService {
    @Autowired
    SubEstacaoRepository repository;

    public List<SubEstacao> obterListaSubstacoes() {
        List<SubEstacao> listaSubstacoes =
                repository.obterListaSubstacoes()
                .stream()
                .map(subEstacao -> {
                    subEstacao.getId();

                    subEstacao.setListaRedesMT(null);
                    return subEstacao;
                }
        ).collect(Collectors.toList());
        return listaSubstacoes;
    }
}

package br.com.sinapsis.projeto.repositorys;

import br.com.sinapsis.projeto.models.SubEstacao;
import br.com.sinapsis.projeto.repositorys.mappers.SubEstacaoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubEstacaoRepository {

    public static final String SELECT_SUBESTACOES = "select ID_SUBESTACAO as id, codigo, nome, latitude, longitude from tb_subestacao ";
    @Autowired
    JdbcTemplate template;

    public List<SubEstacao> obterListaSubstacoes () {
        return template.query(SELECT_SUBESTACOES, new SubEstacaoRowMapper());
    }
}

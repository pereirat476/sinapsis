package br.com.sinapsis.projeto.repositorys.mappers;

import br.com.sinapsis.projeto.models.SubEstacao;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class SubEstacaoRowMapper implements RowMapper<SubEstacao> {
    @Override
    public SubEstacao mapRow(ResultSet rs, int i) throws SQLException {
        return SubEstacao.builder()
                .id(rs.getInt("id"))
                .codigo(rs.getString("codigo"))
                .nome(rs.getString("nome"))
                .latitude(rs.getString("latitude"))
                .longitude(rs.getString("longitude"))
                .build();
    }
}

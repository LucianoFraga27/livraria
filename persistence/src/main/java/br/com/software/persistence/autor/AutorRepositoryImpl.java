package br.com.software.persistence.autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Component
class AutorRepositoryImpl implements AutorRepository {

    private final JdbcClient jdbcClient;

    @Autowired
    public AutorRepositoryImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Autor> findAll () {
        return jdbcClient.sql("SELECT * FROM autor")
                .query(Autor.class)
                .list();
    }

    public Optional<Autor> findById (Long id) {
        return jdbcClient.sql("SELECT id, nome FROM autor WHERE id = :id")
                .param("id",id)
                .query(Autor.class)
                .optional();
    }

    public void create (Autor autor) {
        jdbcClient.sql("INSERT INTO autor (id, nome) VALUES (:id, :nome)")
                .param("id",autor.id())
                .param("nome",autor.nome())
                .update();
    }


    public void delete(Long id) {
        jdbcClient.sql("DELETE FROM autor WHERE id = :id")
                .param("id", id).update();
    }


}

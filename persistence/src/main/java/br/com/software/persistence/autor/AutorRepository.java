package br.com.software.persistence.autor;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface AutorRepository {

    List<Autor> findAll();
    Optional<Autor> findById (Long id);
    void create(Autor autor);
    void delete(Long id);

}

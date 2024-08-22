package br.com.software.service;

import br.com.software.persistence.autor.Autor;
import br.com.software.persistence.autor.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrariaTesteService {


    private final AutorRepository autorRepository;

    @Autowired
    public LivrariaTesteService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<?> getAll() {
        System.err.println("Listando baseado no meu service");
        return autorRepository.findAll();
    }

    public void create(Autor autor) {
        System.err.println("Criando baseado no meu service");
        autorRepository.create(autor);
    }



}

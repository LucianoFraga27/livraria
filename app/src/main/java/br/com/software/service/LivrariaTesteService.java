package br.com.software.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrariaTesteService {

    public List<?> getAll() {
        System.err.println("Listando baseado no meu service");
        return List.of();
    }


}

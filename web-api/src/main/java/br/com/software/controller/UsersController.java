package br.com.software.controller;

import br.com.software.api.UsersApi;
import br.com.software.models.AutorRequestDTO;
import br.com.software.models.UserResponse;

import br.com.software.persistence.autor.Autor;
import br.com.software.service.LivrariaTesteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class UsersController implements UsersApi {
    final private LivrariaTesteService service;

    private Map<String, UserResponse> users = new HashMap<>();

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        List<UserResponse> lista = (List<UserResponse>) service.getAll();
        return ResponseEntity.ok(lista);
    }

    @Override
    public ResponseEntity<Void> createAutor(AutorRequestDTO request) {
        Autor autor = new Autor(null, request.getNome());
        service.create(autor);
        return ResponseEntity.ok().build();
    }
}

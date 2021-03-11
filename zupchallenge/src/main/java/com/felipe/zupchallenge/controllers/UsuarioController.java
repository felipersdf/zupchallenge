package com.felipe.zupchallenge.controllers;

import com.felipe.zupchallenge.entity.Usuario;
import com.felipe.zupchallenge.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody Usuario usuario){
        Usuario usuarioCriado = usuario;
        usuarioService.salvar(usuarioCriado);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCriado);
    }
}

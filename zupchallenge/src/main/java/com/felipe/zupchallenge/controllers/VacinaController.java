package com.felipe.zupchallenge.controllers;

import com.felipe.zupchallenge.entity.Vacina;
import com.felipe.zupchallenge.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public ResponseEntity<Vacina> cadastraVacina(@Valid @RequestBody Vacina vacina) {
        Vacina vacinaCadastrada = vacina;
        vacinaService.salvar(vacinaCadastrada);

        return ResponseEntity.status(HttpStatus.CREATED).body(vacinaCadastrada);
    }
}

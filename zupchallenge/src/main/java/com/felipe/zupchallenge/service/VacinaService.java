package com.felipe.zupchallenge.service;

import com.felipe.zupchallenge.entity.Vacina;
import com.felipe.zupchallenge.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {

    @Autowired
    VacinaRepository vacinaRepository;

        public Vacina salvar(Vacina vacina){
            return vacinaRepository.save(vacina);
        }
}

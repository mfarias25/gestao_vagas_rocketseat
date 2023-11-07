package br.com.mfarias25.gestao_vagas.modules.candidate.controllers;

import br.com.mfarias25.gestao_vagas.modules.candidate.CandiateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandiateEntity candidateEntity) {
        System.out.println("Candidato");
        System.out.println(candidateEntity.getEmail());

    }
}

package br.com.mfarias25.gestao_vagas.modules.candidate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data //Getters and Setters
public class CandiateEntity {

    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;
}

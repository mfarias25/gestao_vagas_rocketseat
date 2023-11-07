package br.com.mfarias25.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data //Getters and Setters
public class CandiateEntity {

    private UUID id;

    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não deve conter espaço")
    private String name;

    @Email(message = "O campo [email] deve conter um email válido")
    private String username;
    private String email;

    @Length (min = 10, max =100)
    private String password;
    private String description;
    private String curriculum;
}

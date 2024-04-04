package br.com.fiap.springpfentregas.dto.request;

import java.time.LocalDate;

public record PessoaRequest(

        String nome,

        String email,

        LocalDate nascimento

) {
}

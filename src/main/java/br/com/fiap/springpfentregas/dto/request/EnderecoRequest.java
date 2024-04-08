package br.com.fiap.springpfentregas.dto.request;

import jakarta.validation.constraints.NotNull;

public record EnderecoRequest(

        @NotNull(message = "O CEP é obrigatório")
        String cep,
        String numero,
        String complemento,

        AbstractRequest pessoa

) {
}

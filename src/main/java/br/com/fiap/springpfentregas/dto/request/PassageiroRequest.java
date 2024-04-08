package br.com.fiap.springpfentregas.dto.request;

import jakarta.validation.constraints.NotNull;

public record PassageiroRequest(
        @NotNull(message = "O atribuo pessoa é obrigatório")
        AbstractRequest pessoa
) {
}

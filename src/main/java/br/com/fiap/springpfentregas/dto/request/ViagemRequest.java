package br.com.fiap.springpfentregas.dto.request;

import java.time.LocalDateTime;
import java.util.Collection;

public record ViagemRequest(
        Collection<AbstractRequest> produtos,
        Collection<AbstractRequest> passageiros,
        AbstractRequest cliente,
        EnderecoRequest origem,
        EnderecoRequest destino,
        LocalDateTime saida,
        LocalDateTime chegada
) {
}

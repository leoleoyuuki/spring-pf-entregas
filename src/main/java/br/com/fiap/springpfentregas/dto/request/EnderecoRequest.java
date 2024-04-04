package br.com.fiap.springpfentregas.dto.request;

public record EnderecoRequest(

        String cep,
        String numero,
        String complemento,
        AbstractRequest pessoa

) {
}

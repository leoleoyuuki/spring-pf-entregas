package br.com.fiap.springpfentregas.dto.request;

public record ProdutoRequest(

        String nome,

        Float peso,

        Float altura,

        Float largura,

        Float profundidade


) {
}

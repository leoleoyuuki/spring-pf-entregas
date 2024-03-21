package br.com.fiap.springpfentregas.resource;

import br.com.fiap.springpfentregas.entity.Endereco;
import br.com.fiap.springpfentregas.entity.Pessoa;
import br.com.fiap.springpfentregas.entity.Produto;
import br.com.fiap.springpfentregas.repository.EnderecoRepository;
import br.com.fiap.springpfentregas.repository.PessoaRepository;
import br.com.fiap.springpfentregas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoRepository repo;

    @Autowired
    private PessoaRepository pessoaRepository;


    @GetMapping
    public List<Endereco> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Endereco save(@RequestBody Endereco endereco) {

        if (Objects.isNull( endereco )) return null;


        if(Objects.nonNull( endereco.getPessoa().getId() )){
            Optional<Pessoa> pessoa = pessoaRepository.findById( endereco.getPessoa().getId() );
            if(pessoa.isPresent()) endereco.setPessoa( pessoa.get() );
        }

        endereco.setId( null );

        return repo.save( endereco );

    }

/**
 * "logalhost/endereco/cep/{cep}" - GET
 * "logalhost/endereco/pessoa/{idPessoa}" - GET
 */

}

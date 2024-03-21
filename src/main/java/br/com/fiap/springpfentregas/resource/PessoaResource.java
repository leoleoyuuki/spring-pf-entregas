package br.com.fiap.springpfentregas.resource;

import br.com.fiap.springpfentregas.entity.Pessoa;
import br.com.fiap.springpfentregas.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

    @Autowired
    private PessoaRepository repo;

    @GetMapping
    public List<Pessoa> findAll() {
        return repo.findAll();
    }


    @GetMapping(value = "/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return repo.findById( id ).orElse( null );
    }


    @Transactional
    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa) {

        if (Objects.isNull( pessoa )) return null;

        pessoa.setId( null );

        return repo.save( pessoa );

    }


}

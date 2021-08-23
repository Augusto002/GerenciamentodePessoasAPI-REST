package com.EUMESMO.Pessoas.APIRest.controller;


import com.EUMESMO.Pessoas.APIRest.dto.MessagemResponseDTO;
import com.EUMESMO.Pessoas.APIRest.entity.Pessoa;
import com.EUMESMO.Pessoas.APIRest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @PostMapping("/Pessoa")
    public MessagemResponseDTO CriarPessoa(@RequestBody Pessoa pessoa){
       Pessoa savedPessoa = pessoaRepository.save(pessoa);
        return MessagemResponseDTO
                .builder()
                .message("Creado com sucesso ID" + savedPessoa.getId())
                .build();
    }

}

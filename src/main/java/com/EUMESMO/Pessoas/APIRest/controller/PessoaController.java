package com.EUMESMO.Pessoas.APIRest.controller;


import com.EUMESMO.Pessoas.APIRest.dto.MessagemResponseDTO;
import com.EUMESMO.Pessoas.APIRest.entity.Pessoa;
import com.EUMESMO.Pessoas.APIRest.repository.PessoaRepository;
import com.EUMESMO.Pessoas.APIRest.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MessagemResponseDTO CriarPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.CriarPessoa(pessoa);
    }

}

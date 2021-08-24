package com.EUMESMO.Pessoas.APIRest.service;

import com.EUMESMO.Pessoas.APIRest.dto.MessagemResponseDTO;
import com.EUMESMO.Pessoas.APIRest.entity.Pessoa;
import com.EUMESMO.Pessoas.APIRest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

     @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
     }

    public MessagemResponseDTO CriarPessoa(@RequestBody Pessoa pessoa){
        Pessoa savedPessoa = pessoaRepository.save(pessoa);
        return MessagemResponseDTO
                .builder()
                .message("Creado com sucesso ID" + savedPessoa.getId())
                .build();
    }
}

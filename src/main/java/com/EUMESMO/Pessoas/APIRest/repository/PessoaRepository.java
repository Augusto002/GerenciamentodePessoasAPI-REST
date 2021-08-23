package com.EUMESMO.Pessoas.APIRest.repository;

import com.EUMESMO.Pessoas.APIRest.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

package com.EUMESMO.Pessoas.APIRest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PessoaController {

    @GetMapping("/Pessoa")
    public String ListarPe(){
        return "Olá Pessoa";
    }

}

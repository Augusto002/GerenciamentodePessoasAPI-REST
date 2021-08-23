package com.EUMESMO.Pessoas.APIRest.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoTelefone {

    Casa("Home"),
    Celular("Mobile"),
    Comercial("Comercial");

    private final String descricao;

}

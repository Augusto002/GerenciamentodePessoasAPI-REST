package com.EUMESMO.Pessoas.APIRest.entity;

import com.EUMESMO.Pessoas.APIRest.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
    private TipoTelefone tipoTelefone;

   @Column(nullable = false)
    private String numero;
}

package com.marcasoft.controleMaquinas.entities

import jakarta.persistence.*
import org.springframework.context.annotation.Bean


@Entity
@Table(name = "maquina")
class Maquina (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maq_id_maquina")
    var maqIdMaquina: Int? = null,

    @Column(name = "maq_nome")
    var maqNome: String,

    @Column(name = "maq_modelo")
    var maqModelo: String,

    @Column(name = "maq_ano_fabricacao")
    var maqAnoFabricacao: String?,

    @Column(name = "maq_observacao")
    var maqObservacao: String?,
)
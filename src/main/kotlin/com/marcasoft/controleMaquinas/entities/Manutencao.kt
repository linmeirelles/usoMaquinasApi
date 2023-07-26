package com.marcasoft.controleMaquinas.entities

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "manutencao")
class Manutencao(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "man_id_manutencao")
    var manIdManutencao: Int,

    @Column(name = "man_id_maquina")
    var manIdMaquina: Int,

    @Column(name = "man_ts_manutencao")
    var manTsManutencao: LocalDateTime = LocalDateTime.now(),

    @Column(name = "man_vl_preco")
    var manVlPreco: Double?,

    @Column(name = "man_descricao")
    var manDescricao: String?

)
package com.marcasoft.controleMaquinas.entities

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "uso_maquina")
class UsoMaquina(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uso_id_uso_maquina")
    var usoIdUsoMaquina: Int,

    @Column(name = "uso_id_maquina")
    var usoIdMaquina: Int,

    @Column(name = "uso_ts_inicio")
    var usoTsInicio : LocalDateTime = LocalDateTime.now(),

    @Column(name = "uso_ts_final")
    var usoTsFinal : LocalDateTime?,

    @Column(name = "uso_vl_custo")
    var usoVlCusto: Double?

)
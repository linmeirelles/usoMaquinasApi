package com.marcasoft.controleMaquinas.controllers

import com.marcasoft.controleMaquinas.services.ManutencaoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/manutencao")
class ManutencaoController (var manutencaoService: ManutencaoService){

    @GetMapping
    fun getAllManutencao() : String {
        return manutencaoService.getAllManutencoes()
    }
}
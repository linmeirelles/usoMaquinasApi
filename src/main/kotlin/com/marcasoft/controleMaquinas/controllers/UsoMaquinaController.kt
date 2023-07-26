package com.marcasoft.controleMaquinas.controllers

import com.marcasoft.controleMaquinas.services.MaquinaService
import com.marcasoft.controleMaquinas.services.UsoMaquinaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/uso_maquina")
class UsoMaquinaController(var usoMaquinaService: UsoMaquinaService) {

    @GetMapping
    fun todasMaquinas() : String {
        return  usoMaquinaService.getAllUsos()
    }

}
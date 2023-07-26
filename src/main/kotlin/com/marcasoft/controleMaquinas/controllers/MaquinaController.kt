package com.marcasoft.controleMaquinas.controllers

import com.marcasoft.controleMaquinas.services.MaquinaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/maquina")
class MaquinaController(var maquinaService: MaquinaService) {

    @GetMapping
    fun todasMaquinas() : String {
        return maquinaService.getAllMaquinas()
    }

    @GetMapping("/{id}")
    fun getMaquinaById(@PathVariable id: Int): String {
        return maquinaService.getAllMaquinas()
    }

}
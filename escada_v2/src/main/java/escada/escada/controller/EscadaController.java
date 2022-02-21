package escada.escada.controller;

import escada.escada.domain.Escada;
import escada.escada.service.EscadaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/escada")
public class EscadaController {

    @Autowired
    private EscadaService escadaService;


    @GetMapping
    public String recuperarEscada(){
        return escadaService.recuperaEscada();
    }


    @PostMapping
    public Escada criarEscada(@RequestBody Escada escada){
        return escadaService.criarEscada(escada);
    }
}

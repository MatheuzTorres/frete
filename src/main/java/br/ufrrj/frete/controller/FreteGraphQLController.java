package br.ufrrj.frete.controller;

import br.ufrrj.frete.service.FreteService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
public class FreteGraphQLController {

    private final FreteService service;

    public FreteGraphQLController(FreteService service) {
        this.service = service;
    }

    @QueryMapping
    public double calcularFrete(@Argument double distancia, @Argument String tipo) {
        return service.calcularFrete(distancia, tipo);
    }
}

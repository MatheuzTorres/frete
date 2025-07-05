package br.ufrrj.frete.service;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double calcularFrete(double distancia, String tipo) {
        double precoKm;
        double taxaFixa;
        double desconto = 0.20;
        double custoKm;

        if (tipo.equalsIgnoreCase("carreta")) {
            precoKm = 40.0;
            taxaFixa = 400.0;
        } else {
            precoKm = 20.0;
            taxaFixa = 200.0;
        }

        if (distancia <= 100) {
            custoKm = precoKm * distancia;
        } else {
            double semDesconto = precoKm * 100;
            double comDesconto = (precoKm * (1 - desconto)) * (distancia - 100);
            custoKm = semDesconto + comDesconto;
        }

        return custoKm + taxaFixa;
    }
}

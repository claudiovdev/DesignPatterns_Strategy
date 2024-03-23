package com.algaworks.transportadora.frete;

import com.algaworks.transportadora.service.Frete;

public class Sedex implements Frete {
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
}

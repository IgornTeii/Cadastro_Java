package com.medicallab.servico;

import com.medicallab.modelo.Usuario;

public class SimulacaoService {
    public void iniciarSimulacao(Usuario usuario) {
        System.out.println("Iniciando simulação para: " + usuario.getNome());
    }

    public void realizarProcedimento() {
        System.out.println("Realizando procedimento...");
    }

    public void finalizarSimulacao() {
        System.out.println("Simulação finalizada.");
    }
}
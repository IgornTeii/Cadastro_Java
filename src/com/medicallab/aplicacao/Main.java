package com.medicallab.aplicacao;

import com.medicallab.modelo.Usuario;
import com.medicallab.servico.SimulacaoService;
import com.medicallab.servico.FeedbackService;
import com.medicallab.servico.AutenticacaoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutenticacaoService authService = new AutenticacaoService();
        SimulacaoService simulacaoService = new SimulacaoService();
        FeedbackService feedbackService = new FeedbackService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Simulador de Cirurgia");

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (authService.login(email, senha)) {
            Usuario usuario = authService.getUsuario(email);
            simulacaoService.iniciarSimulacao(usuario);
            simulacaoService.realizarProcedimento();
            simulacaoService.finalizarSimulacao();
            feedbackService.fornecerFeedback();
        } else {
            System.out.println("Email ou senha incorretos.");
        }

        scanner.close();
    }
}

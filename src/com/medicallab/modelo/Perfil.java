package com.medicallab.modelo;

public class Perfil extends Usuario {
    private String especialidade;

    public Perfil(String nome, String email, String curso, int anoFormacao, String senha, String especialidade) {
        super(nome, email, curso, anoFormacao, senha);
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
package com.medicallab.modelo;

public class Usuario {
    private String nome;
    private String email;
    private String curso;
    private int anoFormacao;
    private String senha;

    public Usuario(String nome, String email, String curso, int anoFormacao, String senha) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome não pode ser vazio");
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("Email não pode ser vazio");
        if (curso == null || curso.isEmpty()) throw new IllegalArgumentException("Curso não pode ser vazio");
        if (senha == null || senha.isEmpty()) throw new IllegalArgumentException("Senha não pode ser vazia");

        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.anoFormacao = anoFormacao;
        this.senha = senha;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public int getAnoFormacao() { return anoFormacao; }
    public void setAnoFormacao(int anoFormacao) { this.anoFormacao = anoFormacao; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
package com.medicallab.servico;

import com.medicallab.modelo.Usuario;
import java.util.HashMap;
import java.util.Map;

public class AutenticacaoService {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public AutenticacaoService() {
        // Dados mockados
        usuarios.put("igor@email.com", new Usuario("Igor", "igor@email.com", "Medicina", 2024, "senha123"));
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public boolean login(String email, String senha) {
        return usuarios.containsKey(email) && usuarios.get(email).getSenha().equals(senha);
    }

    public Usuario getUsuario(String email) {
        return usuarios.get(email);
    }
}

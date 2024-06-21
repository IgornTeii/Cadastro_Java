package com.medicallab.test;

import org.junit.jupiter.api.Test;
import com.medicallab.modelo.Usuario;
import com.medicallab.servico.AutenticacaoService;
import static org.junit.jupiter.api.Assertions.*;

public class AutenticacaoServiceTest {
    @Test
    public void testRegistrarELoginUsuario() {
        AutenticacaoService authService = new AutenticacaoService();
        Usuario usuario = new Usuario("Igor", "igor@email.com", "Medicina", 2024, "senha123");
        authService.registrarUsuario(usuario);

        assertTrue(authService.login(usuario.getEmail(), usuario.getSenha()));
        assertFalse(authService.login(usuario.getEmail(), "senhaErrada"));
    }
}
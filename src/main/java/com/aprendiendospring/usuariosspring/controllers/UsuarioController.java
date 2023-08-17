package com.aprendiendospring.usuariosspring.controllers;

import com.aprendiendospring.usuariosspring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setName("Ánngel");
        usuario.setLastName("Ortiz");
        usuario.setEmail("anngelo.omz@gmail.com");
        usuario.setCell("6143727716");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setName("Ánngel");
        usuario.setLastName("Ortiz");
        usuario.setEmail("anngelo.omz@gmail.com");
        usuario.setCell("6143727716");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setName("Mariam");
        usuario2.setLastName("García");
        usuario2.setEmail("mariam.zgc@gmail.com");
        usuario2.setCell("6143830899");

        usuarios.add(usuario);
        usuarios.add(usuario2);

        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setName("Ánngel");
        usuario.setLastName("Ortiz");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setName("Ánngel");
        usuario.setLastName("Ortiz");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setName("Ánngel");
        usuario.setLastName("Ortiz");
        return usuario;
    }
}

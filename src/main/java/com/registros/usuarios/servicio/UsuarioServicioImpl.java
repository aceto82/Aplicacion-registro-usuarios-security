package com.registros.usuarios.servicio;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registros.usuarios.dto.UsuarioRegistroDTO;
import com.registros.usuarios.modelo.Rol;
import com.registros.usuarios.modelo.Usuario;
import com.registros.usuarios.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
	
	private UsuarioRepositorio usuarioRepositorio; 
	
	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(), registroDTO.getApellido(), registroDTO.getEmail(), registroDTO.getApellido(), Arrays.asList(new Rol("ROLE_UER")));
		
		return this.usuarioRepositorio.save(usuario);
	}

}

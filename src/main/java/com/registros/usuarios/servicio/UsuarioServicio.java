package com.registros.usuarios.servicio;

import com.registros.usuarios.dto.UsuarioRegistroDTO;
import com.registros.usuarios.modelo.Usuario;

public interface UsuarioServicio {
	
	public Usuario guardar(UsuarioRegistroDTO registroDTO);

}

package com.registros.usuarios.dto;

import java.util.Collection;

import com.registros.usuarios.modelo.Rol;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioRegistroDTO {

	private Long id;

	private String nombre;

	private String apellido;

	private String email;

	private String password;

	private Collection<Rol> roles;

	public UsuarioRegistroDTO(String nombre, String apellido, String email, String password, Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
	}

}

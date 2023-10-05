package com.gyanp.workshopmongodb.dto;

import java.io.Serializable;

import com.gyanp.workshopmongodb.domain.User;

public class UserDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String nome;
	private String email;
	

	public UserDTO(User obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

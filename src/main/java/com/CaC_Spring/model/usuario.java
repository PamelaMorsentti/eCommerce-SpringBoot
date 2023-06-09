package com.CaC_Spring.model;

public class usuario {
	private Integer id;
	private String name;
	private String apellido;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	// CONSTRUCTOR VACIO
	public usuario() {
	}
	// CNOSTRUCTOR
	public usuario(Integer id, String name, String apellido, String username, String email, String direccion,
			String telefono, String tipo, String password) {
		super();
		this.id = id;
		this.name = name;
		this.apellido = apellido;
		this.username = username;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}
	
	// GETTERS and SETTERS 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "usuario [id=" + id + ", name=" + name + ", apellido=" + apellido + ", username=" + username + ", email="
				+ email + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password="
				+ password + "]";
	}
	
	
}

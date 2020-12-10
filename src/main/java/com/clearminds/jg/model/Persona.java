package com.clearminds.jg.model;

public class Persona {
	private String Id, Nombre, Apellido;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	}

	public Persona(String id, String nombre, String apellido) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}

}

package com.clearminds.jg.model;

public class ServicioPersonaArchivos implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("insertando persona en un archivo" + persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en un archivo" + persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en un archivo" + persona);
		return true;
	}

}

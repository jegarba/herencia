package com.clearminds.jg.model;

import com.clearminds.jg.excepciones.InstaceException;

public class PersonaManager {

	ServicioPersona serv;

	public PersonaManager() throws InstaceException {
		try {
			Class<?> clase = Class.forName("com.clearminds.jg.model.ServicioPersonaBDD");
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstaceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}

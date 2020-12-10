package com.clearminds.jg.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.jg.excepciones.InstaceException;

public class PersonaManager {

	ServicioPersona serv;

	public PersonaManager() throws InstaceException {
		try {
			String nombre = leerPropiedad("servicio");
			Class<?> clase = Class.forName(nombre);
			serv = (ServicioPersona) clase.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
			throw new InstaceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

	public static String leerPropiedad(String propiedad) {

		File f = new File("config.properties");
		System.out.println("ruta:" + f.getAbsoluteFile());
		Properties p = new Properties();

		try {
			p.load(new FileReader(f.getAbsoluteFile()));
			System.out.println(p.getProperty(propiedad));
			return p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("no se encontro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}

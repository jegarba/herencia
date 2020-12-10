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
		
		File f=new File("config.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());
		Properties p = new Properties();
		
		
		try {
			p.load(new FileReader(f.getAbsoluteFile()));
			System.out.println(p.getProperty("servicio"));
			
			Class<?> clase = Class.forName(p.getProperty("servicio"));
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

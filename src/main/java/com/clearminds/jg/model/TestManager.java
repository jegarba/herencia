package com.clearminds.jg.model;

import com.clearminds.jg.excepciones.InstaceException;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(new Persona("96110212167","jesus","garcia"));
		} catch (InstaceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}

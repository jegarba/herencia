package com.clearminds.jg.model;

public class PersonaManager {
	
	ServicioPersona serv;
	
	public PersonaManager(){
		serv  = new ServicioPersonaBDD(); 
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

}

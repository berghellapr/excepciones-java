package ar.com.unpaz.service;

import ar.com.unpaz.excepciones.UnpazException;

public class MetodoEjemploImp implements MetodoEjemplo {
	@Override
    public void metodoEjemplo() throws UnpazException {
        boolean condicionEjemplo = false; 
        if (!condicionEjemplo) {
            throw new UnpazException("Ocurrió una excepción de tipo UNPAZ por una condición no cumplida.");
        }
    }
}


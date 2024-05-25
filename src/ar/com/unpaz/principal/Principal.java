package ar.com.unpaz.principal;
import ar.com.unpaz.service.*;
import ar.com.unpaz.excepciones.*;

public class Principal {

	public static void main(String[] args) {
		
		 MetodoEjemplo metodo = new MetodoEjemploImp();
	        try {
	            metodo.metodoEjemplo();
	        } catch (UnpazException e) {
	            System.err.println("Capturando la excepción: " + e.getMessage());
	            e.printStackTrace(); 
	        } 
	}
}

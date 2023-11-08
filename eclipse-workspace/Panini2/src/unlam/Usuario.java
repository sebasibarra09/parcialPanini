package unlam;

import java.util.HashSet;
import java.util.Set;

public abstract class Usuario {
	
	protected String nombre;
	
	
	
	public Usuario(String nombre) {
		this.nombre= nombre;
		
		
	}
	
	public abstract Boolean agregarFigurita(Figurita figu) throws CodigoExistenteException;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}

package unlam;

import java.util.HashSet;
import java.util.Set;

public class Album {
	
	public String nombre;
	public Set<Figurita> baseDeDatos;
	public Set<Figurita> stock;
	public Usuario user;
	
	
	public Album(String nombre) {
		this.nombre = nombre;
		this.baseDeDatos= new HashSet<>();	
		this.stock= new HashSet<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
}

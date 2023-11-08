package unlam;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Administrador extends Usuario {
	

	public Set<Figurita> baseDeDatos;
	
	public Administrador(String nombre) {
		super(nombre);
		this.baseDeDatos= new HashSet<>();
	}

	

	public Set<Figurita> getBaseDeDatos() {
		return baseDeDatos;
	}

	public void setBaseDeDatos(Set<Figurita> baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}
	
	@Override
	public Boolean agregarFigurita(Figurita figu) throws CodigoExistenteException {
		if (!baseDeDatos.contains(figu)) {
			baseDeDatos.add(figu);
			return true;
		} else {
			throw new CodigoExistenteException();
			
		}
		
		
	}

}

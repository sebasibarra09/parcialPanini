package unlam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsuarioFinal extends Usuario {
	
	public List<Figurita> stock;
	public Set<Figurita> album;
	
	
	public UsuarioFinal(String nombre) {
		super(nombre);	
		this.stock= new ArrayList<>();
		this.album= new HashSet<>();
	}

	@Override
	public Boolean agregarFigurita(Figurita figu) {
			stock.add(figu);
			Collections.sort(stock);
			return true;
		}
	
	public Boolean pegarFigurita(Figurita figu) throws FiguritaRepetidaException {
		if (album.contains(figu)) {
			throw new FiguritaRepetidaException();
		} 
		album.add(figu);
		return true;
	}
	
	public Boolean intecambioFiguritas(Figurita figu, UsuarioFinal user) throws FiguritaNoDisponibleException{
		if (!user.getAlbum().contains(figu)) {
			for (Figurita figurita : user.getStock()) {
				if (figurita.getSeleccion().equals(figu.getSeleccion()) && figurita.getCodigo().equals(figu.getCodigo()) ) {
					stock.add(figu);
					System.out.println(stock);
					return true;
				}
			}
		} 
		throw new FiguritaNoDisponibleException();
	}

	public Set<Figurita> getAlbum() {
		return album;
	}

	public void setAlbum(Set<Figurita> album) {
		this.album = album;
	}

	public List<Figurita> getStock() {
		return stock;
	}

	public void setStock(List<Figurita> stock) {
		this.stock = stock;
	}
		
}



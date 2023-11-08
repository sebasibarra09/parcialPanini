package unlam;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TestsCase {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Integer codigo =001;
		String letra = "A";
	 	String seleccion= "Argentina";
	 	String nombre= "Messi";
		Double valor= 12.0;
		Figurita figu = new Figurita (001,"A", "Argentina", "Messi",12.0 );
		assertEquals(codigo, figu.getCodigo());
		assertEquals(letra, figu.getLetra());
		assertEquals(seleccion, figu.getSeleccion());
		assertEquals(nombre, figu.getNombre());
		assertEquals(valor, figu.getValor(), 0.02);
	}
	
	@Test
	public void queSePuedaCrearUnAdministrador() {
		Usuario admin = new Administrador ("admin");
		String adminEsperado = "admin";
		assertEquals(adminEsperado, admin.getNombre());
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Usuario usuario = new UsuarioFinal ("usuario");
		String usuarioEsperado = "usuario";
		assertEquals(usuarioEsperado, usuario.getNombre());
		
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistenteException {
		Administrador admin = new Administrador ("admin");
		Figurita figu = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		assertTrue(admin.agregarFigurita(figu));
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		UsuarioFinal user = new UsuarioFinal ("user");
		Figurita figu = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		user.agregarFigurita(figu);
		user.agregarFigurita(figu);
		user.agregarFigurita(figu);
		user.agregarFigurita(figu);
		user.agregarFigurita(figu);
		System.out.println(user.getStock());
		
		assertTrue(user.agregarFigurita(figu));
		assertTrue(user.agregarFigurita(figu));
		assertTrue(user.agregarFigurita(figu));
		assertTrue(user.agregarFigurita(figu));
		assertTrue(user.agregarFigurita(figu));
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas(){
		UsuarioFinal user = new UsuarioFinal ("user");
		Figurita figu = new Figurita (006,"F", "Argentina", "Aessi",12.0 );
		Figurita figu2 = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		Figurita figu3 = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		Figurita figu4 = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		Figurita figu5 = new Figurita (006,"A", "Argentina", "Zessi",12.0 );
		user.agregarFigurita(figu);
		user.agregarFigurita(figu2);
		user.agregarFigurita(figu3);
		user.agregarFigurita(figu4);
		user.agregarFigurita(figu5);
		System.out.println(user.getStock());
		
		Iterator<Figurita> it = user.getStock().iterator();
		
		Figurita primero = it.next();
		System.out.println(primero.getNombre());
		assertEquals("Zessi", primero.getNombre());
		
		for(int i=0; i<3; i++) {
			it.next();
		}
		
		Figurita ultimo = (Figurita)it.next();
		System.out.println(ultimo.getNombre());
		assertEquals("Aessi", ultimo.getNombre());
	
	}
	
	
	@Test (expected= CodigoExistenteException.class)
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws CodigoExistenteException {
		Administrador admin = new Administrador ("admin");
		Figurita figu = new Figurita (001,"A", "Argentina", "Messi", 12.0 );
		Figurita figu2 = new Figurita (001,"C", "Argentina", "Messi", 12.0 );
		admin.agregarFigurita(figu);
		admin.agregarFigurita(figu2);
	}
	
	
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws FiguritaRepetidaException {
		UsuarioFinal user = new UsuarioFinal ("user");
		Figurita figu = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		assertTrue(user.pegarFigurita(figu));
	}
	
	@Test (expected = FiguritaRepetidaException.class)
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() throws FiguritaRepetidaException {
		UsuarioFinal user = new UsuarioFinal ("user");
		Figurita figu = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		user.pegarFigurita(figu);
		user.pegarFigurita(figu);
	}
	
	@Test 
	public void queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() throws FiguritaRepetidaException, FiguritaNoDisponibleException {
		UsuarioFinal user = new UsuarioFinal ("user");
		UsuarioFinal user2 = new UsuarioFinal ("useri");
		Figurita figu = new Figurita (006,"B", "Argentina", "Messi",12.0 );
		user2.agregarFigurita(figu);
		user.intecambioFiguritas(figu, user2);
		System.out.println(user.getStock());
		assertFalse(user.getStock().isEmpty());
	}
	
	
	
	
	
	
	
	

}

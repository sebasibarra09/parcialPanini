package unlam;

public class Figurita implements Comparable<Figurita> {
	
	private Integer codigo;
	private String letra;
	private String seleccion;
	private String nombre;
	private Double valor;
	
	public Figurita(Integer codigo, String letra, String seleccion, String nombre, Double valor) {
		this.codigo = codigo;
		this.letra = letra;
		this.seleccion = seleccion;
		this.nombre = nombre;
		this.valor = valor;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


	@Override
	public int compareTo(Figurita o) {
		return (this.letra+this.seleccion+this.codigo).compareTo((o).getLetra()+(o).getSeleccion()+(o).getCodigo());
	}

/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((seleccion == null) ? 0 : seleccion.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (seleccion == null) {
			if (other.seleccion != null)
				return false;
		} else if (!seleccion.equals(other.seleccion))
			return false;
		return true;
	}

*/
	


	



	
}

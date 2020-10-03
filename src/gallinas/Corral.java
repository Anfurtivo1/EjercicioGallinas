package gallinas;

public class Corral {
	private Gallina gallina;
	private int cantidadHuevos;
	
	public Corral(Gallina gallina, int cantidadHuevos) {
		super();
		this.gallina = gallina;
		this.cantidadHuevos = cantidadHuevos;
	}

	public Gallina getGallina() {
		return gallina;
	}

	public void setGallina(Gallina gallina) {
		this.gallina = gallina;
	}

	public int getCantidadHuevos() {
		return cantidadHuevos;
	}

	public void setCantidadHuevos(int cantidadHuevos) {
		this.cantidadHuevos = cantidadHuevos;
	}

	@Override
	public String toString() {
		return "Corral [gallina=" + gallina.getNombre() + ", cantidadHuevos=" + cantidadHuevos +" Fila="+gallina.getFila()+" Columna="+gallina.getColumna()+ "]";
	}
	
	
	
}

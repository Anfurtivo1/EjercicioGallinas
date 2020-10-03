package gallinas;

public class Gallina {
	private String nombre;
	private int fila;
	private int columna;
	private int huevosPuestos;
	
	
	

	public Gallina(String nombre, int fila, int columna, int huevosPuestos) {
		super();
		this.nombre = nombre;
		this.fila = fila;
		this.columna = columna;
		this.huevosPuestos = huevosPuestos;
	}




	public Gallina() {
		super();
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getFila() {
		return fila;
	}




	public void setFila(int fila) {
		this.fila = fila;
	}




	public int getColumna() {
		return columna;
	}




	public void setColumna(int columna) {
		this.columna = columna;
	}




	public int getHuevosPuestos() {
		return huevosPuestos;
	}




	public void setHuevosPuestos(int huevosPuestos) {
		this.huevosPuestos = huevosPuestos;
	}




	@Override
	public String toString() {
		return "Corral [gallina=" + this.getNombre() + ", cantidadHuevos=" + this.getHuevosPuestos() +" Fila="+this.getFila()+" Columna="+this.getColumna()+ "]";
	}
	
	
}

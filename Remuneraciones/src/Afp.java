
public class Afp {
	private int codigoAfp;
	private String nombre; 
	private int descuento;
	
	public Afp(int codigoAfp, String nombre, int descuento) {
		super();
		this.codigoAfp = codigoAfp;
		this.nombre = nombre;
		this.descuento = descuento;
	}

	public int getCodigoAfp() {
		return codigoAfp;
	}

	public void setCodigoAfp(int codigoAfp) {
		this.codigoAfp = codigoAfp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
	
}

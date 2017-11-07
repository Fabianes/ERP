import java.util.Date;

public class CargaPersona {
	
	private int idCarga;
	private String nombre;
	private Date inicioContrato = new Date();
	private int rutPersona;
	
	public CargaPersona(int idCarga, String nombre, Date inicioContrato, int rutPersona) {
		super();
		this.idCarga = idCarga;
		this.nombre = nombre;
		this.inicioContrato = inicioContrato;
		this.rutPersona = rutPersona;
	}

	public int getIdCarga() {
		return idCarga;
	}

	public void setIdCarga(int idCarga) {
		this.idCarga = idCarga;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(Date inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public int getRutPersona() {
		return rutPersona;
	}

	public void setRutPersona(int rutPersona) {
		this.rutPersona = rutPersona;
	}
	
	
	
	
}

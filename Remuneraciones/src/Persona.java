import java.util.ArrayList;
import java.util.Date;
//import CargaPersona.java;


public class Persona {
	
	int id;
	int rut;
	int digitoVerificador;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String ciudad;
	String direccion;
	Date inicioContrato = new Date();
	float sueldoBase;
	float bonoColacion;
	float bonoMovilizacion;
	String afp;
	int activo;
    private static ArrayList<CargaPersona> CargaPersonas;

	public Persona(int id, int rut, int digitoVerificador, String nombre, String apellidoPaterno,
			String apellidoMaterno, String ciudad, String direccion, Date inicioContrato, float sueldoBase,
			float bonoColacion, float bonoMovilizacion, String afp, int activo) {
		super();
		this.id = id;
		this.rut = rut;
		this.digitoVerificador = digitoVerificador;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.inicioContrato = inicioContrato;
		this.sueldoBase = sueldoBase;
		this.bonoColacion = bonoColacion;
		this.bonoMovilizacion = bonoMovilizacion;
		this.afp = afp;
		this.activo = activo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getInicioContrato() {
		return inicioContrato;
	}
	public void setInicioContrato(Date inicioContrato) {
		this.inicioContrato = inicioContrato;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public float getBonoColacion() {
		return bonoColacion;
	}
	public void setBonoColacion(float bonoColacion) {
		this.bonoColacion = bonoColacion;
	}
	public float getBonoMovilizacion() {
		return bonoMovilizacion;
	}
	public void setBonoMovilizacion(float bonoMovilizacion) {
		this.bonoMovilizacion = bonoMovilizacion;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	

}

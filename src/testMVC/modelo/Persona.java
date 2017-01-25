package testMVC.modelo;

public class Persona {
	int dni;
	String nombre;
	String apellido;
	int patente;
	public Persona(int dni, String nombre, String apellido, int patente) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.patente = patente;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	
	
	

}

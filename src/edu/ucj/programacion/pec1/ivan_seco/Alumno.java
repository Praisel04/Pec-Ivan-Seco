package edu.ucj.programacion.pec1.ivan_seco;

public class Alumno {
	//-------------------------------------------------------------------------VARIABLES INSTANCIA-------------------------------------------------------------------------
	private String nombre;
	private String apellido;
	private String dni;


	//-------------------------------------------------------------------------CONSTRUCTOR-------------------------------------------------------------------------
	public Alumno(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni; 
	}
	
	//-------------------------------------------------------------------------GETTERS AND SETTERS-------------------------------------------------------------------------
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}

package edu.ucj.programacion.pec1.ivan_seco;

public class Colegio {
	//-------------------------------------------------------------------------VARIABLES INSTANCIA-------------------------------------------------------------------------
	private String nombre;
	private String direccion;
	private int asientos;
	
	
	//-------------------------------------------------------------------------CONSTRUCTOR-------------------------------------------------------------------------
	public Colegio(String nombre, String direccion, int asientos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.setAsientos(asientos);
	}

	//-------------------------------------------------------------------------GETTERS AND SETTER-------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getAsientos() {
		return asientos;
	}


	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
	
	
//---------------------------------------------------------------------------------CREACION DE METODOS-------------------------------------------------------------------------
	/**
	 * Este método asigna a cada alumno el asiento libre de cada aula.
	 * Añadimos el parameto de numero de aulas para que funcione para cualquier numero de aulas y un numero de asientos. Ademas de un array con todos los alumnos que se van a usar
	 * @param alumno
	 * @param numeroAulas
	 * @param alumnos
	 */
	
	/* La funcionalidad de este metodo es iniciar el método con un numero de aulas (que viene dado por la consola) y asientos que viene predefinido, para poder crear un array de alumnos 
	 * que sea bidimensional para guardar AULA || ASIENTO. 
	 * Despues el for anidado recorre la primera "AULA" y accede al primer asiento,añadiendo a este el primer alumno del array [] alumnos que será el incorporado del metodo de creacion de alumnos.
	 * Si encuentra que estan llenos, se imprimirá que no hay asientos libres.
	 */
	
	public void asignarAsientos(int numeroAulas, Alumno [] alumnos, int numeroAsientos) {
		
		Alumno [][] arrayAlumno = new Alumno [numeroAulas][numeroAsientos];
		int k = 0;
		
		
		for(int aula = 0; aula<numeroAulas; aula++) {
			for (int j = 0; j<numeroAsientos; j++) {
				arrayAlumno[aula][j] = alumnos[k];
				System.out.println("El alumno con nombre: " + alumnos[k].getNombre() +"apellido: "+alumnos[k].getApellido() +"y DNI: "+ alumnos[k].getDni()
				+ "asiento " + j +"y aula: " + aula);
				k++;
			}
			System.out.println("El aula " + aula + "tiene todos los asientos ocupados.");
		}
	
	}
	
}

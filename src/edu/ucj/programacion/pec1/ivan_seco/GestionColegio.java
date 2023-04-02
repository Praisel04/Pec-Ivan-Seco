package edu.ucj.programacion.pec1.ivan_seco;

public class GestionColegio {

	public static void main(String[] args) {
		//ENLACE GITHUB: https://github.com/Praisel04/Pec-Ivan-Seco.git
		 
		/*
		 * CLASE CON EL METODO MAIN INICIADO CON VALORES DESDE EL RUN CONFIGURATIONS.
		 * 			-NOMBRE.
		 * 			-DIRECCIÓN.
		 * 			-NUMERO AULAS.
		 * 			-NUMEROS ALUMNOS.
		 * SE CREA EL COLEGIO CON LOS DATOS DADOS AL []args y se crea un objeto de la clase main para llamar al metodo de funcionalidad del programa.
		 * Le entran los parametros dados desde la consola al main y el colegio creado.
		 */
		
		Colegio colegio1 = new Colegio(args[0], args[1], Integer.parseInt(args[3]));
		GestionColegio gestion = new GestionColegio();
		gestion.funcionalidadPrograma(Integer.parseInt(args[3]), colegio1, Integer.parseInt(args[2]));
		
		
		
	}
	/**
	 * Mediante una sobrecarga de metodos, este metodo que será el que implemente la funcionalidad del programa.
	 * Los parametros que entran son el numero de aulas y los alumnos, además del colegio creado.
	 * 
	 * Se crea un objeto de la clase utils para poder usar el metodo de creación de alumnos, se guarda el array en una variable.
	 * Después la objeto de tipo COLEGIO llamará al metodo de asignar alumnos y le entrarán los datos numAulas, 3 (numero asientos) y el array de crearAlumnos. 
	 * 
	 * @param numeroAlumnos
	 * @param colegio
	 * @param numeroAulas
	 */
	public void funcionalidadPrograma(int numeroAlumnos, Colegio colegio, int numeroAulas) {
		UtilsColegio utilidades = new UtilsColegio();
		Alumno [] array = utilidades.crearAlumnos(numeroAlumnos);
		colegio.asignarAsientos(numeroAulas, array, 3);

		
		
		
	}
}

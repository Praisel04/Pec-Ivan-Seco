package edu.ucj.programacion.pec1.ivan_seco;

import java.util.Scanner;

public class UtilsColegio {
	
	/**
	 * Este metodo crea una cantidad de objetos de tipo ALUMNO como se le indique y los guarda en un ARRAY de tipo ALUMNO para poder usarlos posteriormente.
	 * 
	 * @param numeroAlumnos
	 * @return arrayAlumnos
	 */
	public Alumno [] crearAlumnos(int numeroAlumnos) {
		Alumno arrayAlumnos [] = new Alumno [numeroAlumnos];
		for (int i = 0; i< numeroAlumnos; i++) {
			//CREACION DE LA INVOCACIÓN DEL OBJETO Y DEL ARRAY DONDE SE GUARDARÁN LOS ALUMNOS.
			Alumno alumno = null;
			
			//PEDIMOS LA INFORMACIÓN DE LOS OBJETOS
			Scanner scan = new Scanner(System.in);
			System.out.println("ESCRIBA EL NOMBRE DEL ALUMNO:");
			String resultadoN = scan.nextLine();
			
			
			System.out.println("ESCRIBA EL APELLIDO DEL ALUMNO");
			String resultadoA = scan.nextLine();
			
			
			System.out.println("ESCRIBA EL DNI DEL ALUMNO");
			String resultadoS = scan.nextLine();
			
			alumno = new Alumno(resultadoN, resultadoA, resultadoS);
			arrayAlumnos[i] = alumno;
			
		}
		
		
		return arrayAlumnos;
	}
	
	
}

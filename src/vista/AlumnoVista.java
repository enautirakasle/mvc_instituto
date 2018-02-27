package vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Alumno;
import modelo.AlumnoModelo;
import modelo.Matricula;

public class AlumnoVista {
	public static final int ALUMNOS_MATRICULAS = 1;
	public static final int LISTAR_ALUMNOS = 2;
	public static final int SALIR = 0;
	
	public void menuAlumnos() {
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		AlumnoModelo alumnoModelo = new AlumnoModelo();
		ArrayList<Alumno> alumnos;
		
		do {
			System.out.println("--Menu de alumnos--");
			
			System.out.println(ALUMNOS_MATRICULAS + " - alumnos con matriculas");
			System.out.println(LISTAR_ALUMNOS + " - listar alumnos");
			
			System.out.println(SALIR + " - salir");
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			
			case ALUMNOS_MATRICULAS:
				
				alumnos = alumnoModelo.selectAllConMatriculas();
				this.mostrarAlumnosConAsignaturas(alumnos);
				break;
			case LISTAR_ALUMNOS:

				alumnos = alumnoModelo.sellectAll();
				this.mostrarAlumnos(alumnos);
				
				break;
			default:
				break;
			}

		} while (opcion != SALIR);

	}

	private void mostrarAlumnos(ArrayList<Alumno> alumnos) {
		Iterator<Alumno> i = alumnos.iterator();
		while(i.hasNext()){
			Alumno alumno = i.next();
			System.out.println(alumno.getNombre()+ " :\t "+ alumno.getDni()+ " :\t " +alumno.getProvincia().getNombre());
			
		}
		
	}

	private void mostrarAlumnosConAsignaturas(ArrayList<Alumno> alumnos) {
		Iterator<Alumno> i = alumnos.iterator();
		while(i.hasNext()){
			Alumno alumno = i.next();
			mostrarAlumnoConAsignaturas(alumno);
		}
		
	}

	private void mostrarAlumnoConAsignaturas(Alumno alumno) {
		System.out.println(alumno.getNombre() + " " + alumno.getDni());
		System.out.println("...............");
		ArrayList<Matricula> matriculas = alumno.getMatriculas();
		Iterator<Matricula> i = matriculas.iterator();
		while(i.hasNext()){
			Matricula matricula = i.next();
			System.out.println(matricula.getFecha()  + " : " + matricula.getAsignatura().getNombre() + "("
					+matricula.getAsignatura().getHoras()+ ")");
		}
		System.out.println("------------------------");
	}
}

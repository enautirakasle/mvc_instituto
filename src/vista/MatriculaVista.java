package vista;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Alumno;
import modelo.AlumnoModelo;
import modelo.Asignatura;
import modelo.AsignaturaModelo;
import modelo.Matricula;

public class MatriculaVista {

	public void mostrarMatriculas(ArrayList<Matricula> matriculas){
		Iterator<Matricula> i = matriculas.iterator();
		while(i.hasNext()){
			Matricula matricula = i.next();
			mostrarMatricula(matricula);
		}
		
	}
	
	public void mostrarMatricula(Matricula matricula){
		//conseguir la info de asignatura y alumno
	
		System.out.println(matricula.getAlumno().getNombre() + " : "
				+ matricula.getAlumno().getDni()+ " : "
				+ matricula.getAsignatura().getNombre()+ " : "
				+ matricula.getAsignatura().getHoras()+ " : "
				+ matricula.getFecha());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

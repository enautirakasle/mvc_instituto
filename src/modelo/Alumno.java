package modelo;

import java.util.ArrayList;

public class Alumno {

	private int id;
	private String nombre;
	private String dni;
	private String email;
	//por la relacion
	private ArrayList<Matricula> matriculas;
	
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

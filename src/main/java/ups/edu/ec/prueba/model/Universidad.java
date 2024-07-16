package ups.edu.ec.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Universidad {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String pais;
	private int numeroEstudiantes;
	
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(int numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	@Override
	public String toString() {
		return "Universidad [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", numeroEstudiantes="
				+ numeroEstudiantes + "]";
	}
	
	
	
}

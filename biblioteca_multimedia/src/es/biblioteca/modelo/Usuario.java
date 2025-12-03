package es.biblioteca.modelo;

import java.util.Objects;


public class Usuario {
	
	//Atributos
	private String nombre, email;
	private int id, edad;
	
	//Constructores
	public Usuario() {
		
	}
	
	public Usuario(String nombre, int id, String email, int edad) {
		this.nombre = nombre;
		this.id = id;
		this.email = email;
		this.edad = edad;
	}

	
	//Getters & Setters---------------------------------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//MÉTODOS------------------------------------------------------------------------------------------------------------------- 
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", id=" + id + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return this.id == other.id; //A diferencia de lo que ocurre en Libro, aquí hay 
									//que usar en la sentencia de retorno == en luar de equals, al ser id un tipo primitivo (int)
									//Para objetos tipo String etc, usar ejemplo.atributo.equals(otro.atributo)
				
	}
	
	
	
}

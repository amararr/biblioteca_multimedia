package es.biblioteca.modelo;

import java.util.HashSet;
import java.util.Objects;

import es.biblioteca.interfaces.Catalogable;
import es.biblioteca.interfaces.Costeable;


public class Libro implements Costeable, Catalogable {

	//Atributos
	private String titulo, autor;
	private int anioPublicacion;
	private double precioBase;
	
	//Constructores 
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int anioPublicacion, double precioBase) {
		/*this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.precioBase = precioBase;*/
		
		setTitulo(titulo);
		setAutor(autor);
		setAnioPublicacion(anioPublicacion);
		setPrecioBase(precioBase);
					
	}

	//Getters && Setters------------------------------------------------------------------------------------------------
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	
	//MÉTODOS--------------------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", precioBase="
				+ precioBase + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;		// Aquí se comprueba si son exáctamente el mismo objeto y ya no necesitamos comprobar más.
		if (!(obj instanceof Libro)) return false; //Aquí se comprueba si no son de la misma clase
		
		Libro otroLibro = (Libro) obj; // Se crea una variable de tipo Libro, y le asignamos la conversión de la referencia obj a tipo Libro 
		return (this.getTitulo().equals(otroLibro.getTitulo()))&&(this.getAutor().equals(otroLibro.getAutor()));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor);
	}
	
	
	@Override
	public double getPrecioFinal() {
		return getPrecioBase();
	}
	@Override
	public String getDescripcionCatalogo() {
		return "Descripción";
	}
}

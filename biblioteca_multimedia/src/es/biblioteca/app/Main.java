package es.biblioteca.app;

import es.biblioteca.modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*APARTADO 1--------------------------------------------------------------------------------------------------------------------
		
		// Con los constructores, si los atributos son privados no se pueden modificar. ¿Necesario setters y getters?
		Libro l1 = new Libro(); 
		l1.titulo = "Los tres mundos";
		l1.autor = "Santiago Posteguillo";
		l1.anioPublicacion = 2025;
		l1.precioBase = 30.00;
		
		Libro l2 = new Libro("Don Quijote de La Mancha", "Miguel de Cervantes", 1547, 25.00);
		
		//Ejecución Apartado 1 (A comentar cuando atributos pasen a ser privados
		
		System.out.println("Título: " + l1.titulo + "\nAutor: " + l1.autor + "\nAño de Publicacion: " + l1.anioPublicacion + "\nPVP: " 
				+ l1.precioBase +"€" );
		System.out.println("Título: " + l2.titulo + "\nAutor: " + l2.autor + "\nAño de Publicacion: " + l2.anioPublicacion + "\nPVP: " 
		+ l2.precioBase +"€" );
		*/
		
		//APARTADO 2
		
		Libro l1 = new Libro(); 
		l1.setTitulo("Los tres mundos");
		l1.setAutor("Santiago Posteguillo");
		l1.setAnioPublicacion(2025);
		l1.setPrecioBase(30.00);
		
		Libro l2 = new Libro("Don Quijote de La Mancha", "Miguel de Cervantes", 1547, 25.00);
		
		//Ejecución Apartado 1 (A comentar cuando atributos pasen a ser privados
		
		/*System.out.println("Título: " + l1.titulo + "\nAutor: " + l1.autor + "\nAño de Publicacion: " + l1.anioPublicacion + "\nPVP: " 
				+ l1.precioBase +"€" );
		System.out.println("Título: " + l2.titulo + "\nAutor: " + l2.autor + "\nAño de Publicacion: " + l2.anioPublicacion + "\nPVP: " 
		+ l2.precioBase +"€" );*/
		
		
		//Ejecución Apartado 2
		
				
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		//Ejecución apartado 3
		
		Libro l3 = new Libro("Don Quijote de La Mancha", "Miguel de Cervantes", 1547, 25.00); 
		System.out.println("\n"+(l2==l3));
		System.out.println("\n"+l2.equals(l3));
		System.out.println("\n"+l2.hashCode());
		System.out.println("\n"+l3.hashCode());
	}

}

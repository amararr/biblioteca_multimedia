package es.biblioteca.app;

import java.util.ArrayList;
import java.util.Iterator;

import es.biblioteca.interfaces.Catalogable;
import es.biblioteca.interfaces.Costeable;
import es.biblioteca.modelo.Libro;
import es.biblioteca.modelo.Usuario;
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
		System.out.println("\n\n Apartado 2------------------------------------------ \n");
				
		System.out.println(l1); //No es necesario llamar al metodo to String, lo hace de forma automática el syso
		System.out.println(l2);
		
		//Ejecución apartado 3
		System.out.println("\n\n Apartado 3------------------------------------------ \n");
		
		Libro l3 = new Libro("Don Quijote de La Mancha", "Miguel de Cervantes", 1547, 25.00); 
		System.out.println("\n"+(l2==l3));
		System.out.println("\n"+l2.equals(l3));
		System.out.println("\n"+l2.hashCode());
		System.out.println("\n"+l3.hashCode());

		//Ejecución apartado 4
		System.out.println("\n\n Apartado 4------------------------------------------ \n");
		
		Libro l4 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1996, 21.00);
		Libro l5 = new Libro("El muro de Berlín", "Frederick Taylo", 1961, 19.50);
		
		ArrayList<Libro> listaLibros = new ArrayList<>();
		listaLibros.add(l1);
		listaLibros.add(l2);
		listaLibros.add(l3);
		listaLibros.add(l4);
		listaLibros.add(l5);
		
		for (int i=0; i < listaLibros.size(); i++) { // NO OLVIDAR DECLARA INT i AL PRINCIPIO, SI NO NO SE CREA LA VARIABLE AUXILIAR
			System.out.println(listaLibros.get(i));
		}
		
		for (Libro listaLibro : listaLibros) { //La variable listaLibro no almacena objetos, solo apunta al siguiente elemento de la lista listaLibros
			System.out.println(listaLibro);
		}
		
		//Ejecución Apartado 5
		System.out.println("\n\n Apartado 5------------------------------------------ \n");
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario("Ana Martínez", 1, "ana.martinez@example.com", 28));
		listaUsuarios.add(new Usuario("Luis García", 2, "luis.garcia@example.com", 35));
		listaUsuarios.add(new Usuario("María López", 3, "maria.lopez@example.com", 22));
		listaUsuarios.add(new Usuario("Carlos Pérez", 4, "carlos.perez@example.com", 41));
		listaUsuarios.add(new Usuario("Elena Torres", 5, "elena.torres@example.com", 30));
		listaUsuarios.add(new Usuario("Javier Ruiz", 6, "javier.ruiz@example.com", 19));
		listaUsuarios.add(new Usuario("Sara Fernández", 7, "sara.fernandez@example.com", 27));
		listaUsuarios.add(new Usuario("Miguel Herrera", 8, "miguel.herrera@example.com", 50));
		
		for (int i = 0; i <listaUsuarios.size(); i++) {
			System.out.println(listaUsuarios.get(i));
		}
			
		System.out.println("\n\n");
		
		for (Usuario listaUsuario : listaUsuarios) {
			System.out.println(listaUsuario);
		}
		
		//Ejecución Apartado 6
				System.out.println("\n\n Apartado 6------------------------------------------ \n");
		
		ArrayList<Costeable> listaCosteable = new ArrayList<>();
		listaCosteable.add(l1);
		listaCosteable.add(l2);
		listaCosteable.add(l3);
		
		for (Costeable lista : listaCosteable) {
			System.out.println(lista.getPrecioFinal()); //Acuérdate que no basta con llamar al método. Siempre hay que poner objeto.metodo
		}
				
				
				
				
				
				
				
				
				
				
				
	}
	
	
}

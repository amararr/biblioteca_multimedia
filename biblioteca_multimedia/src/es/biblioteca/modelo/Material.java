package es.biblioteca.modelo;

public abstract class Material {
	
	protected final double IVA = 1.21; 
	protected final double PRECIOPROVEEDOR = 0.80;
	protected String titulo;
	protected int anioPublicacion;
	protected double precioBase;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	
	public abstract double costeAdquisicion();
	
	public double precioFinal() {
		return getPrecioBase()*IVA;
	}

}

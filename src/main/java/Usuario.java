package main.java;

public class Usuario {

	private String nombre;

	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public static void obtenerReferenciaAMetodoEstatico() {
		System.out.println("Probando referencia a método estático");
	}

	public void obtenerReferenciaAMetodoParticular() {
		System.out.println("Probando referencia a método de objeto particular");
	}

	public void mostrarNombre() {
		System.out.println(nombre);
	}
}

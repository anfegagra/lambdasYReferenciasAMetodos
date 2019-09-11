package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Referencia a static method	Class::staticMethod	  Math::abstracto	n -> Math.abs(n)

        Trabajo trabajo = new Trabajo() {
            @Override
            public void hacerAlgo() {
                Usuario.obtenerReferenciaAMetodoEstatico();
            }
        };

        Trabajo trabajoLambda = () -> Usuario.obtenerReferenciaAMetodoEstatico();
        Trabajo trabajoMetodoReferencia = Usuario::obtenerReferenciaAMetodoEstatico;
        trabajoMetodoReferencia.hacerAlgo();

        /* Referencia a un método de instancia	instancia::metodoInstancia  s::toString	 () -> "".toString()
        de un objeto particular */

        Usuario usuario = new Usuario("pipe");
        Trabajo trabajoLambda1 = () -> usuario.obtenerReferenciaAMetodoParticular();
        Trabajo trabajoMetodoReferencia1 = usuario::obtenerReferenciaAMetodoParticular;
        trabajoMetodoReferencia1.hacerAlgo();

        /* Referencia a un método de instancia	Class::metodoInstancia	String::toString    s -> s.toString()
           de un objeto arbitrario de un tipo
           particular */

        TrabajoString trabajoStringLambda = (palabra -> palabra.toUpperCase());
        TrabajoString trabajoStringReferenciaMetodo = String::toUpperCase;
        System.out.println(trabajoStringReferenciaMetodo.hacerAlgo("pipe"));

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("pipe"));
        usuarios.add(new Usuario("david"));
        usuarios.add(new Usuario("pao"));
        usuarios.add(new Usuario("laura"));

        //usuarios.forEach(u -> u.mostrarNombre());
        usuarios.forEach(Usuario::mostrarNombre);
    }
}

package main.java;

public class Main {

    public static void main(String[] args) {

        // Referencia a static method Class::staticMethod Math::abstracto n ->Math.abs(n)

        Trabajo trabajo = new Trabajo() {
            @Override
            public void hacerAlgo() {
                Usuario.obtenerReferenciaAMetodoEstatico();
            }
        };

        Trabajo trabajoLambda = () -> Usuario.obtenerReferenciaAMetodoEstatico();
        Trabajo trabajoMetodoReferencia = Usuario::obtenerReferenciaAMetodoEstatico;
        trabajoMetodoReferencia.hacerAlgo();
    }
}

// Clase que representa un carro, derivada de la clase Vehiculo
class Carro extends Vehiculo {
    private static final int VALOR_PEAJE = 2;  // El peaje que paga un carro

    public Carro(String placa) {
        super(placa);
    }

    // Sobrescribe el método para calcular el peaje
    @Override
    public int calcularPeaje() {
        return VALOR_PEAJE;
    }

    // Sobrescribe el método para imprimir detalles del carro
    @Override
    public void imprimir() {
        System.out.println("Carro con placa n°: " + getPlaca() + " - Peaje: $" + calcularPeaje());
    }
}
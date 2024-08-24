// Clase que representa una moto, derivada de la clase Vehiculo
class Moto extends Vehiculo {
    private static final int VALOR_PEAJE = 1;  // El peaje que paga una moto

    public Moto(String placa) {
        super(placa);
    }

    // Sobrescribe el método para calcular el peaje
    @Override
    public int calcularPeaje() {
        return VALOR_PEAJE;
    }

    // Sobrescribe el método para imprimir detalles de la moto
    @Override
    public void imprimir() {
        System.out.println("Moto con placa n°: " + getPlaca() + " - Peaje: $" + calcularPeaje());
    }
}
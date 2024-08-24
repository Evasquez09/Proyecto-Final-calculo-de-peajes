// Clase que representa un camión, derivada de la clase Vehiculo
class Camion extends Vehiculo {
    private static final int VALOR_PEAJE_EJE = 1;  // El peaje que paga cada eje del camión
    private int numeroEjes;  // Número de ejes del camión

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    // Sobrescribe el método para calcular el peaje, basado en el número de ejes
    @Override
    public int calcularPeaje() {
        return VALOR_PEAJE_EJE * numeroEjes;
    }

    // Sobrescribe el método para imprimir detalles del camión
    @Override
    public void imprimir() {
        System.out.println("Camion con placa n°: " + getPlaca() + " - Peaje: $" + calcularPeaje() + " (Número de ejes: " + numeroEjes + ")");
    }
}
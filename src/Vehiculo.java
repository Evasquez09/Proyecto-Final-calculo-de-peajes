// Clase base que representa un vehículo genérico
class Vehiculo {
    private String placa;  // Número de placa del vehículo

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método para calcular el peaje que debe pagar el vehículo (será sobrescrito en las clases hijas)
    public int calcularPeaje() {
        return 0;
    }

    // Método para imprimir detalles del vehículo (será sobrescrito en las clases hijas)
    public void imprimir() {
        System.out.println("Vehículo con placa n°: " + placa);
    }
}
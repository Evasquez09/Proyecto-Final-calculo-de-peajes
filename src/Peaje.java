// La clase principal que representa un sistema de peaje en una localidad específica.
public class Peaje {

    // Variables que almacenan la información básica del peaje
    private String nombre;  // Nombre del peaje
    private String departamento;  // Departamento o ciudad donde se encuentra el peaje
    private int totalPeaje;  // Total acumulado de peajes recolectados
    private int totalCarros;  // Total de carros que han pasado por el peaje
    private int totalMotos;  // Total de motos que han pasado por el peaje
    private int totalCamiones;  // Total de camiones que han pasado por el peaje

    // Constructor que inicializa los datos del peaje
    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeaje = 0;  // Se inicia en 0 ya que aún no hay vehículos que hayan pasado por el peaje
        this.totalCarros = 0;
        this.totalMotos = 0;
        this.totalCamiones = 0;
    }

    // Métodos para obtener y modificar el nombre del peaje
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y modificar el departamento donde está ubicado el peaje
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método que añade un vehículo al sistema y calcula su peaje
    public void anadirVehiculo(Vehiculo vehiculo) {
        int peaje = calcularPeaje(vehiculo);  // Se calcula el peaje según el tipo de vehículo
        totalPeaje += peaje;  // Se suma el peaje al total acumulado

        // Se actualiza el contador según el tipo de vehículo
        if (vehiculo instanceof Carro) {
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
        }
    }

    // Método que calcula el peaje según el tipo de vehículo
    public int calcularPeaje(Vehiculo vehiculo) {
        return vehiculo.calcularPeaje();  // El método calcularPeaje es implementado por cada tipo de vehículo
    }

    // Método que imprime un resumen del peaje, incluyendo el total recaudado y el detalle de cada vehículo
    public void imprimir() {
        System.out.println("Resumen del peaje: " + nombre + ", ciudad: " + departamento);
        System.out.println("Total recolectado por el peaje: $" + totalPeaje);
        System.out.println(" - Total de carros: " + totalCarros);
        System.out.println(" - Total de motos: " + totalMotos);
        System.out.println(" - Total de camiones: " + totalCamiones);
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Peaje de Machachi", "Quito, departamento de cobros");

        // Creación de diferentes vehículos que pasan por el peaje
        Vehiculo carro1 = new Carro("PDL4682");
        Vehiculo carro2 = new Carro("PDL4768");
        Vehiculo moto = new Moto("PCA082A");
        Vehiculo camion = new Camion("PDD0558", 4);

        // Se añaden los vehículos al sistema de peaje
        peaje.anadirVehiculo(carro1);
        peaje.anadirVehiculo(carro2);
        peaje.anadirVehiculo(moto);
        peaje.anadirVehiculo(camion);

        // Se imprime el resumen del peaje, con el total recaudado y los detalles de los vehículos
        peaje.imprimir();

        // Se imprimen los detalles individuales de cada vehículo
        System.out.println("Detalle de los vehículos:");
        carro1.imprimir();
        carro2.imprimir();
        moto.imprimir();
        camion.imprimir();
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo auto=new Auto("Toyota", "Hilux", 2026, 5);
        Vehiculo moto=new Moto("BMW", "Ninja", 2027, true);

        System.out.println(auto.mostrarInformacion());
        auto.mostrarCaracteristicas();
        System.out.println("----------------------");
        System.out.println(moto.mostrarInformacion());
        moto.mostrarCaracteristicas();
    }
}

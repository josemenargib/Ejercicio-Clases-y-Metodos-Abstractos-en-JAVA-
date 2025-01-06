public class Auto extends Vehiculo {

     int numeroPuertas;
    public Auto(String marca, String modelo, int anio,int numeroPuertas) {
            super(marca, modelo, anio);
            this.numeroPuertas=numeroPuertas;
        }
    
       

    @Override
    double calcularImpuestos() {
        return (5/100f)*anio*numeroPuertas;
    }

    @Override
    void mostrarCaracteristicas() {
       System.out.println(mostrarInformacion()+ "\n"+"numero de puertas: "+numeroPuertas+"\n"
                                               + "Impuesto: "+calcularImpuestos());
    }

    
}

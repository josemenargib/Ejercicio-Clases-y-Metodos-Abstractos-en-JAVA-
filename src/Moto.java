public class Moto extends Vehiculo{
        boolean tieneSidecar=true;
    public Moto(String marca, String modelo, int anio,boolean tieneSidecar) {
            super(marca, modelo, anio);
            this.tieneSidecar=tieneSidecar;
            //TODO Auto-generated constructor stub
        }
    
        @Override
    double calcularImpuestos() {
       
       double impuesto=(3/100f)*anio;
       if (tieneSidecar) {
            impuesto=impuesto*1.2;
       }

        return impuesto;
    }

    @Override
    void mostrarCaracteristicas() {
        System.out.println(mostrarInformacion()+"Tiene side car?: "+tieneSidecar+"\n"
                                               + "Impuesto: "+calcularImpuestos());
    }

}

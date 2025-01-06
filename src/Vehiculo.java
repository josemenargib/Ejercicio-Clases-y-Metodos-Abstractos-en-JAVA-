public abstract class Vehiculo {

    String marca,modelo;
    int anio;

    public Vehiculo(String marca,String modelo,int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    }

    abstract double calcularImpuestos();
    abstract void mostrarCaracteristicas();

    String mostrarInformacion(){
        return "marca: "+marca +"\n"
        + "modelo: "+modelo+"\n"+
        "Año: "+anio;
    }
}

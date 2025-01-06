Ejercicio: Sistema de Vehículos
Instrucciones:
Crea una clase abstracta llamada Vehiculo con los siguientes atributos y métodos:

Atributos:
String marca
String modelo
int anio
Métodos:
Constructor que inicialice los atributos.
Un método abstracto double calcularImpuesto().
Un método abstracto void mostrarCaracteristicas().
Un método concreto String mostrarInformacion() que devuelva los detalles básicos del vehículo (marca, modelo, año).
Crea dos clases concretas que extiendan Vehiculo:

Auto:
Atributos adicionales: int numeroPuertas.
Implementa el método calcularImpuesto() (impuesto = 5% del año del vehículo multiplicado por el número de puertas).
Implementa el método mostrarCaracteristicas() para mostrar información específica del auto.
Moto:
Atributos adicionales: boolean tieneSidecar.
Implementa el método calcularImpuesto() (impuesto = 3% del año del vehículo, con un 20% extra si tiene sidecar).
Implementa el método mostrarCaracteristicas() para mostrar información específica de la moto.
En una clase Main, crea objetos de Auto y Moto, y utiliza los métodos para calcular el impuesto y mostrar sus características.
package Clases;

public class Auto extends Vehiculo{
    private int cantPuertas;

    public Auto(String marca, String modelo, float precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }
}

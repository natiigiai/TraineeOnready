package Clases;

public class Moto extends Vehiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, float precio, int cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }
}

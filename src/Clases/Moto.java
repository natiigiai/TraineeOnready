package Clases;

import java.text.NumberFormat;

public class Moto extends Vehiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, float precio, int cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrar() {
        //para mostrar el precio en formato de importe
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        System.out.println("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Cilindradas: "+this.getCilindradas()+"cc // Precio: "+formatoImporte.format(this.getPrecio()));
    }

    /*Getters y Setters*/
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}

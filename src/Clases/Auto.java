package Clases;

import java.text.NumberFormat;

public class Auto extends Vehiculo{

    private int cantPuertas;

    public Auto(String marca, String modelo, float precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void mostrar() {
        //Para mostrar el precio del vehiculo en formato de importe
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        System.out.println("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Puertas: "+this.cantPuertas+" // Precio: "+formatoImporte.format(this.getPrecio()));
    }

    /*Getters y Setters*/
    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}

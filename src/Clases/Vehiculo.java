package Clases;

import java.text.NumberFormat;
import java.util.Locale;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo() {

    }

    public void mostrar(){}

    public void contieneLetra(char letra){
        String minuscula = this.getModelo().toLowerCase(Locale.ROOT);
        String mayuscula = this.getModelo().toUpperCase(Locale.ROOT);
        if (minuscula.contains(String.valueOf(letra)) || mayuscula.contains(String.valueOf(letra))){
            //Para mostrar el precio del vehiculo en formato de importe
            NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
            System.out.println(this.getMarca()+" "+this.getModelo()+" "+formatoImporte.format(this.getPrecio()));
        }
    }

    /*Getters y Setters*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

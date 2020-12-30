package Clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Auto auto1 = new Auto("Peugot", "206", 200000F, 4);
        Auto auto2 = new Auto("Peugot", "208", 250000F, 5);
        Moto moto1 = new Moto("Honda","Titan", 60000F,125);
        Moto moto2 = new Moto("Yamaha","YBR",80500.50F,160);

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(auto1);
        vehiculos.add(moto1);
        vehiculos.add(auto2);
        vehiculos.add(moto2);
        //listar vehículos
        listar(vehiculos);

        //Vehículo mas caro
        vehiculoMasCaro(vehiculos);

        //Vehículo mas barato
        vehiculoMasBarato(vehiculos);

        //Vehículo que contienen en el modelo una letra pasada por parámetro
        contienenLetra(vehiculos, 'Y');
        System.out.println("===============================");
        //Vehículos ordenados por precio de mayor a menor
        ordenarPorPrecio(vehiculos);
        System.out.println("===============================");
    }

    private static void ordenarPorPrecio(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio));
        int n = vehiculos.size();
        for (int i=0; i<n; i++){
            System.out.println(vehiculos.get(i).getMarca()+" "+vehiculos.get(i).getModelo());
        }
    }

    private static void contienenLetra(ArrayList<Vehiculo> vehiculos, char letra) {
        System.out.println("Vehículos que contiene en el modelo la letra '"+letra+"': ");
        int n = vehiculos.size();
        for (int i=0; i<n; i++){
            vehiculos.get(i).contieneLetra(letra);
        }
    }

    private static void vehiculoMasBarato(ArrayList<Vehiculo> vehiculos) {
        Vehiculo aux = new Vehiculo();
        aux= vehiculos.get(0);
        for (Vehiculo v: vehiculos){
            if(v.getPrecio() < aux.getPrecio()){
                aux=v;
            }
        }
        System.out.println("Vehículo más barato: "+aux.getMarca()+" "+aux.getModelo());
    }

    private static void vehiculoMasCaro(ArrayList<Vehiculo> vehiculos) {
        Vehiculo aux = new Vehiculo();
        aux= vehiculos.get(0);
        for (Vehiculo v: vehiculos){
            if(v.getPrecio() > aux.getPrecio()){
                aux=v;
            }
        }
        System.out.println("Vehículo más caro: "+aux.getMarca()+" "+aux.getModelo());
    }

    private static void listar(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Listado de vehículos");
        int n = vehiculos.size();
        for (int i = 0; i < n; i++) {
            vehiculos.get(i).mostrar();
        }
        System.out.println("===============================");
    }
}

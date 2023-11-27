package com.mycompany.tiendadulcesumad;

import java.util.Random;

abstract class Producto implements IVA {
    private int id;
    private String nombre;
    private double precio;
    private static double porcIVA;

    public Producto(String nombre, double precio) {
        Random random = new Random();
        this.id = random.nextInt(9999);
        this.nombre = nombre;
        this.precio = precio;
        this.porcIVA = 0.16;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    double calcIVA(){
        return precio * porcIVA;
    }
    
    @Override
    public double obtenerPrecioConIVA(){
        return precio + calcIVA();
    }
}
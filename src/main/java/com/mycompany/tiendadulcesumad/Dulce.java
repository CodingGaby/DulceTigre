package com.mycompany.tiendadulcesumad;

public class Dulce extends Producto {
    private String gramos;
    
    public Dulce(String nombre, double precio, String gram){
        super(nombre, precio);
        this.gramos = gram;
    }
}

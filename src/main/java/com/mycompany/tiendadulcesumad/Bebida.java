package com.mycompany.tiendadulcesumad;

public class Bebida extends Producto {
    private String mililitros;
    
    public Bebida(String nombre, double precio, String mili){
        super(nombre, precio);
        this.mililitros = mili;
    }
}

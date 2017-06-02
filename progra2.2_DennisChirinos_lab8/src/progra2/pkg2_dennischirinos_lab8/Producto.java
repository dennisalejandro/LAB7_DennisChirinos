/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab8;

/**
 *
 * @author denni
 */
public class Producto {

    String Nombre;
    String Categoria;
    double Precio;
    double Descuento;

    public Producto(String Nombre, String Categoria, double Precio, double Descuento) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Descuento = Descuento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        String tostring = this.Nombre + ": " + this.Precio + "$ " + ((1 - this.Descuento) * 10) + "%";
        return tostring;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab8;

import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Cliente {
    String Nombre;
    int Edad;
    boolean isUsuario = false;
    ArrayList<Producto> listProductos = new ArrayList();

    public Cliente(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", listProductos=" + listProductos + '}';
    }
    
}

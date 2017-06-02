/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denni
 */
public class SaveData {
    public void CrearFactura(Cliente c) {
        File f = new File("./Factura.txt");
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            double Total = 0;
            bw.write("Nombre: " + c.getNombre() + "\n");
            bw.newLine();
            bw.write("Edad: " + c.getEdad() + "\n");
            bw.newLine();
            bw.newLine();
            for (int i = 0; i < c.listProductos.size(); i++) {
                double x = c.listProductos.get(i).Precio * c.listProductos.get(i).getDescuento();
                bw.write(c.listProductos.get(i).getNombre()
                        + ": " + " " + (x));
                Total += x;
                bw.newLine();
            }
            bw.write("Total: " + Total);
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SaveProductos(ArrayList<Producto> list) {
        File temp = new File("./SaveDataProductos.txt");
        try {
            FileWriter fw = new FileWriter(temp);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).Nombre + ";");
                bw.write(list.get(i).Categoria + ";");
                bw.write(list.get(i).Precio + ";");
                bw.write(list.get(i).Descuento + ";");
            }
            bw.flush();
            fw.close();
            bw.close();
        } catch (Exception e) {
        }
    }

    public ArrayList<Producto> LoadProductos() {
        ArrayList<Producto> list = new ArrayList();
        File temp = new File("./SaveDataProductos.txt");
        try {
            Scanner sc = new Scanner(temp);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String Nombre = sc.next();
                //System.out.println(Nombre);
                String Categoria = sc.next();
                double Precio = sc.nextDouble();
                double Descuento = sc.nextDouble();
                Producto c = new Producto(Nombre, Categoria, Precio, Descuento);
                list.add(c);
            }
            sc.close();
        } catch (Exception e) {
        }
        if (!list.isEmpty()) {
            return list;
        } else {
            return null;
        }
    }
}

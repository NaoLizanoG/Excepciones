import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    System.out.println();

    Inventario i1 = new Inventario();
    Producto p1 = new Producto("Leche","Milka", 8);
    i1.agregar(p1);
    Producto p2= new Producto("Chocolate", "Paccari", 10);
    i1.agregar(p2);
    Producto p3= new Producto("Gaseosa", "Coca Cola", 5);
    i1.agregar(p3);
    Producto p4= new Producto("Leche condensada", "La Lechera", 15);
    i1.agregar(p4);


    Producto producto = new Producto();
    i1.agregar(producto);

    i1.buscar();

    }
}

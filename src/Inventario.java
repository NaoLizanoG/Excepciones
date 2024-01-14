import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Inventario {
    List<Producto> productos = new ArrayList<Producto>();

    public void agregar(Producto p1){
        productos.add(p1);
    }

    public void buscar() {

        int salir = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a tu inventario");

            System.out.printf("Ingrese el número del producto que quiere conocer ");
            int a = sc.nextInt();
            Producto p2 = new Producto();
            p2 = productos.get(a);

            System.out.println("Marca " + p2.getMarca());
            System.out.println("Producto " + p2.getTipo());
            System.out.println("Cantidad disponible " + p2.getCantidad());

            System.out.println("Ingrese a cuantos supermercados se debe distirbuir el producto");
            int b = sc.nextInt();
            int c = p2.getCantidad() / b;

            System.out.println("La cantidad de producto que se debe enviar a cada supermercado es: " + c);



        } catch (ArithmeticException e) {
            System.out.println("¡Error! No se puede dividir para cero");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("¡Error! Índice fuera de los límites.");
        } catch (InputMismatchException e) {
            System.out.println("¡Error! El tipo de dato es incorrecto.");
        } catch (Exception e) {
            System.out.println("¡Error!");
        }

    }

}

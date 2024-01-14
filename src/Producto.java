public class Producto {

    private String tipo;
    private String marca;
    private int cantidad;

    public Producto(String tipo, String marca, int cantidad) {
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

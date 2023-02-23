
package tienda;

public class ProductoElectronico {
   
    /*  ===================================================================
        Crea una clase abstracta llamada ProductoElectronico que tenga los 
        siguientes atributos:
        ===================================================================*/
    double precio;
    String marca;
    String modelo;

    // getPrecio(): un método que devuelve el precio del producto.
    public double getPrecio() {
        return precio;
    }
   
    //getMarca(): un método que devuelve la marca del producto.
    public String getMarca() {
        return marca;
    }
    
    //getModelo(): un método que devuelve el modelo del producto.
    public String getModelo() {
        return modelo;
    }
 
    //setPrecio(double precio): un método que establece el precio del producto.
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //setMarca(String marca): un método que establece la marca del producto.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //setModelo(String modelo): un método que establece el modelo del producto
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

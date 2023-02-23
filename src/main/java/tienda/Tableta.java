
package tienda;

class Tableta extends ProductoElectronico{
    double tamanoPantalla;
    String resolucionPantalla;

    /*
    getTamanoPantalla(): un método que devuelve el tamaño de la pantalla de 
    la tableta
    */
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    /*
    setTamanoPantalla(double tamanoPantalla): un método que establece el 
    tamaño de la pantalla de la tableta.
    */
    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    /*
    getResolucionPantalla(): un método que devuelve la resolución de la 
    pantalla de la tableta
    */
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    /*
    setResolucionPantalla(String resolucionPantalla): un método que establece 
    la resolución de la pantalla de la tableta
    */
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
}

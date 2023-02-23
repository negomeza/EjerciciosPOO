
package tienda;

class TelefonoMovil extends ProductoElectronico{
    int capacidadAlmacenamiento;
    int duracionBateria;

    /*
    getCapacidadAlmacenamiento(): un método que devuelve la capacidad de 
    almacenamiento del teléfono móvil
    */
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }
    /*
    getDuracionBateria(): un método que devuelve la duración de la batería del 
    teléfono móvil.
    */
    public int getDuracionBateria() {
        return duracionBateria;
    }
    /*
    setCapacidadAlmacenamiento(int capacidadAlmacenamiento): un método 
    que establece la capacidad de almacenamiento del teléfono móvil.
    */
    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    /*
    setDuracionBateria(int duracionBateria): un método que establece la 
    duración de la batería del teléfono móvil.
    */
    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
    
    
}

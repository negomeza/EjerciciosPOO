
package cuentas;

public class cuenta {
    int saldo;

    public cuenta(int saldo) {
        this.saldo = saldo;
    }
    
    public void abonar(int saldo){
        this.saldo += saldo;
    }
    
    public void debitar(int saldo){
        this.saldo -= saldo;
    }
    
    public int mostrar(){
        return this.saldo;
    }
}
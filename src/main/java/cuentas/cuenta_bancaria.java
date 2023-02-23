
package cuentas;

import java.util.Scanner;


public class cuenta_bancaria {
    
 
    public static void main(String[] args){
        
    cuenta cuenta1 = new cuenta(100);
    cuenta cuenta2 = new cuenta(200);

    
    
    
    
        while (true) {            
            Scanner validacion = new Scanner(System.in);
            System.out.println("1. Abonar");
            System.out.println("2. Debitar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            
            int Menu = validacion.nextInt();
            
            switch (Menu) {
                case 1:
                    cuenta1.abonar(100);
                    cuenta2.abonar(100);
                    break;
                case 2:
                    cuenta1.debitar(100);
                    cuenta2.debitar(100);
                    break;
                case 3:
                    System.out.println("El saldo de la cuenta 1 es: " + cuenta1.mostrar());
                    System.out.println("El saldo de la cuenta 2 es: " + cuenta2.mostrar());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    
    }
}

/* Ejericio 5
Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al menos m dígitos d,
 siendo n, m y d valores que el usuario ingresará por consola.

Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola los primeros 5 números
 naturales que tienen, al menos, 2 dígitos 3. En este caso la salida será: 33, 133, 233, 303, 313.

* */

import java.util.Scanner;

public class NaturalesDigitos {
    public static int cuentaDigitos(String sn, int d){
        int count = 0;
        char[] cNum = sn.toCharArray();
        for(char n: cNum){
            int t = + Character.getNumericValue(n);
            if(Character.getNumericValue(n) == d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int d = sc.nextInt();
        System.out.print("Ingresa la cantidad de "+ d +"s que deben tener los números: ");
        int m = sc.nextInt();
        System.out.print("Ingresa la cantidad de números que tienen "+ m + " digitos "+ d + ": ");
        int n = sc.nextInt();
        while(n != 0){
            String sNumber = String.valueOf(i);
            int count = cuentaDigitos(sNumber, d);
            if(count >= m){
                System.out.println(i);
                n--;
            }
            i++;
        }
        sc.close();
    }
}

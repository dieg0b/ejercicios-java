/* Ejercicio 3
 Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que el usuario ingresará por
 consola.  Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
* */

import java.util.Scanner;

public class Primos {

    public static boolean esPrimo(int n){
        if (n == 1){
            return true;
        }else if(n == 0){
            return false;
        }else{
            int i = 2;
            while (i <= n / 2){
                if(n % i == 0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        if(esPrimo(n)){
            System.out.println(n + " es primo");
        }else{
            System.out.println(n + " es no primo");
        }
        sc.close();
    }
}

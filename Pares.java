/* Ejercicio 1
Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que el usuario ingresará por
consola. Recordá que un número es par cuando es divisible por 2.
*/

import java.util.Scanner;

public class Pares {

    public static boolean esPar(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números pares que deseas: ");
        int n = sc.nextInt();

        while( n != 0 ){
            if(esPar(i)){
                System.out.println(i);
            }
            i++;
            n--;
        }
        sc.close();
    }
}

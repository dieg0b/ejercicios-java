/* Ejercicio 2
 Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario ingresará
 por consola. Recordá que un número a es múltiplo de b si a es divisible por b.
* */

import java.util.Scanner;

public class Multiplos {

    public static boolean esMultiplo(int i, int m){
        return i % m == 0;
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int m = sc.nextInt();
        System.out.print("Ingresa la cantidad de números multiplos de " + m + " que deseas: ");
        int n = sc.nextInt();

        while (n != 0){
            if(esMultiplo(i, m)){
                System.out.println(i);
                n--;
            }
            i++;
        }
        sc.close();
    }
}

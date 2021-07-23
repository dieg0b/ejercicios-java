/* Ejercicio 4
Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n un valor que el usuario
 ingresará por consola.
 * */
import java.util.Scanner;


public class ListaPrimos {

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Primos p = new Primos();

        System.out.print("Ingresa la cantidad de números primos que deseas: ");
        int n = sc.nextInt();
        while(n != 0){
            if (p.esPrimo(i)){
                System.out.println(i);
                n--;
            }
            i++;
        }
        sc.close();
    }
}

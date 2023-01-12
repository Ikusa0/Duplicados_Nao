import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros_impares = new ArrayList<>();
        List<Integer> numeros_primos = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                numeros_impares.add(i);
            }
            if (isPrime(i)) {
                numeros_primos.add(i);
            }
        }

        System.out.println("Números Ímpares: ");
        System.out.println(numeros_impares.toString());

        System.out.println("\nNúmeros Primos:");
        System.out.println(numeros_primos.toString());

        System.out.println();

        for (int i = 0; i < numeros_impares.size(); i++) {
            for (int j = 0; j < numeros_primos.size(); j++) {
                if (numeros_impares.get(i) == numeros_primos.get(j)) {
                    System.out.println("Match!!!");
                    System.out.println("Número: " + numeros_impares.get(i));
                    System.out.println("Posição em Ímpares: " + i);
                    System.out.println("Posição em Primos: " + j + "\n\n");
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1)
            return false;

        int squareRoot = (int) Math.sqrt(number);

        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

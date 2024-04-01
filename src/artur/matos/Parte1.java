package artur.matos;

import java.util.Arrays;
import java.util.Scanner;

public class Parte1 {

   
    public static String[] ordenarNomes(String[] nomes) {
        Arrays.sort(nomes);
        return nomes;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 1: Ordenar nomes em ordem alfabética");
        System.out.print("Digite os nomes das pessoas separados por vírgula: ");
        String input = scanner.nextLine();
        String[] nomes = input.split(",");
        String[] nomesOrdenados = ordenarNomes(nomes);
        System.out.println("Nomes em ordem alfabética: " + Arrays.toString(nomesOrdenados));
        scanner.close();
    }
}




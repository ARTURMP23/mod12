package artur.matos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte2 {

    
    public static void separarPorGenero(List<String> nomes, List<String> masculinos, List<String> femininos) {
        for (String nome : nomes) {
			Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o gênero (M/F) de " + nome + ": ");
            String genero = scanner.nextLine();
            if (genero.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (genero.equalsIgnoreCase("F")) {
                femininos.add(nome);
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 2: Separar nomes por gênero");
        List<String> nomes = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();
        System.out.println("Introduza o nome de 5 pessoas.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        separarPorGenero(nomes, masculinos, femininos);
        System.out.println("Nomes masculinos: " + masculinos);
        System.out.println("Nomes femininos: " + femininos);
        scanner.close();
    }
}


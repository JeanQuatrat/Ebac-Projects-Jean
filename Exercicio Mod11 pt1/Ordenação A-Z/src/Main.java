import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista para armazenar os nomes
        List<String> nomes = new ArrayList<>();

        // Ler nomes do console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        // Separar os nomes por vírgula e adicionar à lista
        String[] nomesArray = entrada.split(",");
        for (String nome : nomesArray) {
            nomes.add(nome.trim()); // Remover espaços em branco antes e depois do nome
        }

        // Ordenar a lista
        Collections.sort(nomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
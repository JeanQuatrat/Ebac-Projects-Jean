import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Criar um mapa para armazenar nomes por gênero
        Map<String, List<String>> generos = new HashMap<>();

        // Ler nomes e gêneros do console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros separados por vírgula e traço (ex: João-Masculino, Maria-Feminino):");
        String entrada = scanner.nextLine();

        // Separar os pares de nome e gênero por vírgula
        String[] pares = entrada.split(",");
        for (String par : pares) {
            // Separar nome e gênero por traço
            String[] partes = par.split("-");
            String nome = partes[0].trim();
            String genero = partes[1].trim();

            // Adicionar o nome ao grupo correspondente de gênero
            generos.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);
        }

        // Ordenar os nomes dentro de cada grupo de gênero
        for (List<String> nomes : generos.values()) {
            Collections.sort(nomes);
        }

        // Imprimir os grupos de gênero
        System.out.println("Nomes organizados por gênero:");
        for (Map.Entry<String, List<String>> entry : generos.entrySet()) {
            String genero = entry.getKey();
            List<String> nomes = entry.getValue();

            System.out.println(genero + ": " + nomes);
        }
    }
}
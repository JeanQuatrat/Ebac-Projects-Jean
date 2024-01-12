import java.util.ArrayList;
import java.util.Scanner;
    
    public class Main {
    
        public static void main(String[] args) {

            // Listas para armazenar homens e mulheres.
            ArrayList<String> men = new ArrayList<>();
            ArrayList<String> woman = new ArrayList<>();
    
            // Scanner para obter entrada do usuário
            Scanner scanner = new Scanner(System.in);
    
            // Loop para obter informações até que o usuário deseje parar.
            while (true) {
                System.out.print("Digite o nome (ou 'endlist' para encerrar): ");
                String name = scanner.nextLine();
    
                // Verifica se o usuário deseja encerrar.
                if (name.equalsIgnoreCase("endlist")) {
                    break;
                }
    
                System.out.print("Digite o sexo (M/F): ");
                char sexo = scanner.nextLine().toUpperCase().charAt(0);
    
                // Adiciona a pessoa ao grupo correspondente.
                if (sexo == 'M') {
                    men.add(name);
                } else if (sexo == 'F') {
                    woman.add(name);
                } else {
                    System.out.println("Sexo inválido. Por favor, digite M ou F.");
                }
            }
    
            // Exibe os grupos de homens e mulheres.
            System.out.println("\nGrupo de Homens:");
            exibirLista(men);
    
            System.out.println("\nGrupo de Mulheres:");
            exibirLista(woman);
    
            // Fecha o scanner
            scanner.close();
        }
    
        // Função para exibir os elementos de uma lista.
        private static void exibirLista(ArrayList<String> lista) {
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        }
    }


package cli;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExemploFrutas {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Cria um conjunto (Set) para armazenar as frutas sem duplicatas
        Set<String> frutas = new HashSet<>();
        
        // Loop infinito para manter o menu funcionando até o usuário escolher sair
        while(true) {
            try {
                // Exibe as opções do menu para o usuário
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Remover uma fruta");
                System.out.println("4. Verificar se uma fruta está presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");
                
                // Lê a opção escolhida pelo usuário
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do Scanner
                
                // Decide o que fazer com base na opção escolhida
                switch(opcao) {
                //Opção 01 da lista
                    case 1:
                        // Adiciona uma nova fruta ao conjunto
                        System.out.print("Digite o nome da fruta para adicionar: ");
                        String novaFruta = scanner.nextLine();
                        
                        // Tenta adicionar a fruta ao conjunto e verifica se ela já existe
                        if(frutas.add(novaFruta)) {
                            System.out.println(novaFruta + " foi adicionada.");
                        } else {
                            System.out.println(novaFruta + " já está presente no conjunto.");
                        }
                        break;
                        
                        // Opção 2 da lista
                    case 2:
                        // Exibe todas as frutas no conjunto
                        System.out.println("Frutas: " + frutas);
                        break;
                        
                        // Opção 3 da lista
                    case 3:
                        // Remove uma fruta do conjunto
                        System.out.print("Digite o nome da fruta que deseja remover: ");
                        String frutaRemover = scanner.nextLine();
                        
                        // Tenta remover a fruta e verifica se ela realmente estava lá
                        if(frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada.");
                        }
                        break;
                        
                        //Opção 4 da lista
                    case 4:
                        // Verifica se uma fruta está no conjunto
                        System.out.print("Digite o nome da fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine();
                        
                        // Verifica se a fruta está no conjunto e avisa o usuário
                        if(frutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " está presente no conjunto.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
                        }
                        break;
                        
                        // Opção 5 da lista
                    case 5:
                        // Encerra o programa
                        System.out.println("Saindo...");
                        scanner.close(); // Fecha o Scanner antes de sair
                        return;
                    default:
                        // Caso o usuario digite uma opção incorreta/invalida das opções passadas
                        System.out.println("Opção inválida. Tente novamente.");
                }
                
            } catch (java.util.InputMismatchException e) {
                // Caso tenha um erro quando o usuário digita algo que não é um número
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer para evitar loop infinito
            }
        }
    }
}

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class ProgramaViagem {
    public static void main(String[] args) {
        try {
            FileWriter arq = new FileWriter("C:\\Users\\MASTER\\Desktop\\recibo_viagem.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            System.out.println("Informe o seu nome: ");
            String nomePessoa = scanner.nextLine();
            
            System.out.println("Informe a sua idade: ");
            int idadePessoa = scanner.nextInt();

            scanner.nextLine();
            
            System.out.println("Informe o seu CPF: ");
            String cpfPessoa = scanner.nextLine();
            
            System.out.println("Escolha um destino:");
            System.out.println("1. São Paulo");
            System.out.println("2. Nova York");
            System.out.println("3. Berlim");
            System.out.println("Opção Escolhida: ");
            int opcaoViagem = scanner.nextInt();
            
            String destinoEscolhido;
            double valorPassagem;
            
                switch (opcaoViagem) {
                    case 1:
                        destinoEscolhido = "São Paulo";
                        valorPassagem = 250.00;
                        break;
                    case 2:
                        destinoEscolhido = "Nova York";
                        valorPassagem = 2400.00;
                        break;
                    case 3:
                        destinoEscolhido = "Berlim";
                        valorPassagem = 3800.00;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

            int poltrona = random.nextInt(20) + 1;
            
            gravarArq.println("Recibo de Viagem");
            gravarArq.println("Nome: " + nomePessoa);
            gravarArq.println("Idade: " + idadePessoa);
            gravarArq.println("CPF: " + cpfPessoa);
            gravarArq.println("Destino: " + destinoEscolhido);
            gravarArq.println("Valor a ser pago: R$" + valorPassagem);
            gravarArq.println("Número da poltrona: " + String.format("%02d", poltrona));
            
            scanner.close();
            
             arq.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaSupermercado {
    public static void main(String[] args) {
        try {
            FileWriter arq = new FileWriter("C:\\Users\\MASTER\\Desktop\\itens_supermercado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            Scanner scanner = new Scanner(System.in);
            
            for (int i = 0; i < 10; i++) {
                
                System.out.print("Informe o nome do item " + (i + 1) + ": ");
                String nomeProdutos = scanner.nextLine();
                
                System.out.print("Informe o valor do item " + (i + 1) + ": ");
                double valorProdutos = Double.parseDouble(scanner.nextLine());
                
                gravarArq.println("Item: " + nomeProdutos);
                gravarArq.printf("Valor: R$ %.2f", valorProdutos);
                gravarArq.println();
            }

            scanner.close();
            
            arq.close();
        } catch (IOException e) {
             System.out.println(e);
        }
    }
}

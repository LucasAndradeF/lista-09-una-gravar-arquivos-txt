import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        try {
            FileWriter arq = new FileWriter("C:\\Users\\MASTER\\Desktop\\alunos_universidade.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            Scanner scanner = new Scanner(System.in);
            
            for (int i = 0; i < 5; i++) {
                
                System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
                String nomesAlunos = scanner.nextLine();
                
                System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
                double notasAlunos = Double.parseDouble(scanner.nextLine());
                
                gravarArq.println("Nome do aluno: " + nomesAlunos);
                gravarArq.println("Nota do aluno: " + notasAlunos);
                gravarArq.println();
            }
            
            scanner.close();
            
            arq.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


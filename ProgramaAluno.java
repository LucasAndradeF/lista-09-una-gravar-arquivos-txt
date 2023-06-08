import java.io.FileWriter;
import java.io.PrintWriter;

public class ProgramaAluno {
  public static void main(String[] args) {
    try {
      FileWriter arq = new FileWriter("C:\\Users\\MASTER\\Desktop\\Nova pasta\\arquivo.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
      Aluno aluno = new Aluno();

      gravarArq.write(aluno.nomes());
      gravarArq.write(aluno.notas());

      arq.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

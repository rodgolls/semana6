import javax.swing.JOptionPane;
public class TesteTurma{
   public static void main (String args[]){
      String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
      String curso = JOptionPane.showInputDialog("Digite o nome do curso");
      int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos de sua sala"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
      
      Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
      JOptionPane.showMessageDialog(null, "nome: " + nome + "\ncurso: " + curso +"\nquantidade de alunos: " + quantidadeDeAlunos + "\nserie: " + serie);
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
      turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
      JOptionPane.showMessageDialog(null, "nome: " + nome + "\ncurso: " + curso +"\nquantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nserie: " + serie);

  }
}
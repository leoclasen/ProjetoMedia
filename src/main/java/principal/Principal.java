package principal;

import model.Aluno;
import javax.swing.JOptionPane;

public class Principal {
    
     public static void main(String args[]){
         Aluno alu = new Aluno();
         
         alu.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 1: ")));
         alu.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 2: ")));
         alu.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 3: ")));
         
         JOptionPane.showMessageDialog(null, "A média das notas é: " + alu.getMedia());
         
         
         
     }
    
}

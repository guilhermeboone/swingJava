/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacaoemailswing;

/**
 *
 * @author g.boone
 */
import javax.swing.JOptionPane;
public class ValidacaoEmailSwing {

    public static void main(String[] args) {
    String email = JOptionPane.showInputDialog("Digite seu e-mail: ");
    
    try{
    
        if (!email.contains("@")){
            throw new IllegalAccessException("E-mail inválido: Faltando o simbolo do @. ");
        }
        if (email.length()<8){
            throw new Exception ("E-mail muito curto. Verifique e tente novamente. ");
        }
        JOptionPane.showMessageDialog(null,"E-mail aceito: "+email);
    }
    catch (IllegalArgumentException e1){
    JOptionPane.showMessageDialog(null,"Erro: "+e1.getMessage());
    }
    catch (Exception e2){
    JOptionPane.showMessageDialog(null,"Erro: "+e2.getMessage());
    }
    
}
}

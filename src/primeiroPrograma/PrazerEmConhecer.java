package primeiroPrograma;

import javax.swing.JOptionPane;

public class PrazerEmConhecer {

    //sistema que pergunta qual é seu nome e recebe com seja bem vindo
    public static void main(String[] args) {
        String resposta;
        resposta=JOptionPane.showInputDialog("Qual é o seu nome ?");

        JOptionPane.showMessageDialog(null, " olá "  + resposta + " !é um prazer em conhece-lo(a)!");

    }

}

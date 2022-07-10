import javax.swing.*;

public class guessNumber {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 100 + 1);
        System.out.println(numero);
        int resposta = 0;
        int cont = 5;


        while (resposta != numero && cont >= 0) {
            String response = JOptionPane.showInputDialog(null, "Entre com um número de 1 a 100","Jogo de Adivinhação", JOptionPane.QUESTION_MESSAGE);
            resposta = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(resposta, numero, cont));
            cont--;
        }
        JOptionPane.showMessageDialog(null, "A resposta era " + numero);
    }

    public static String determineGuess(int resposta, int numero, int cont) {

        if (resposta <= 0 || resposta > 100) {
            return "Número fora do limite";
        } else if (resposta == numero) {
            return "Correto, Você Conseguiu!\nO numero era " + numero + "\nTentativas restantes = " + cont;
        } else if (resposta > numero) {
            return "Muito alto, tente outro.\nTentativas restantes: " + cont;
        } else {
            return "Muito baixo, tente outro.\n" + "Tentativas restantes: " + cont;
        }
    }
}

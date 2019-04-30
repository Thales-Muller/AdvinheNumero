/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinheonumero;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Thales Muller
 */
public class jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int n = 0, a = 0, cont = 0;
        Boolean vitoria = true;

        try {
            String Ad = JOptionPane.showInputDialog(null, "Pensei em um número de 1 a 50. Qual é?(digite 0  para desistir)");
            a = Integer.parseInt(Ad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor invalido!\nO programa sera fechado");
            return;
        }
        n = r.nextInt(50) + 1;
        while (vitoria) {
            System.out.println(n);
            if (a == 0) {
                vitoria = false;
            } else if (a == n) {
                JOptionPane.showMessageDialog(null, "Você acertou o número " + n + " depois de " + cont + " tentativa(s).");
                vitoria = false;
            } else if (a > n) {
                try {
                    String Ad = JOptionPane.showInputDialog(null, "Meu número é MENOR que este...Tente de novo.");
                    a = Integer.parseInt(Ad);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor invalido!\nO programa sera fechado");
                    return;
                }
                cont++;
            }else if (a < n){
                try {
                    String Ad = JOptionPane.showInputDialog(null, "Meu número é MAIOR que este...Tente de novo.");
                    a = Integer.parseInt(Ad);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor invalido!\nO programa sera fechado");
                    return;
                }
                cont++;
            }
        }

    }

}

import javax.swing.*;
import java.util.Random;

public class STP {
    public static void main(String[] args) {
        int antalSpelare, dator, spelare1, spelare2;
        int poang1 = 0;
        int poang2 = 0;
        int datorpoang = 0;
        int rundor;
        Random rand = new Random();


        antalSpelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Välj antal spelare (1) eller (2)"));

        while (antalSpelare > 2 || antalSpelare < 1 ) {
            antalSpelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Du måste välja antingen (1) eller (2)"));
        }

        rundor = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många runder ska spelas? 3 eller 5?"));
        while (rundor != 3 && rundor != 5) {
            rundor = Integer.parseInt(JOptionPane.showInputDialog(null,"Fel svar! Välj antingen 3 eller 5!"));
        }


        while (rundor > 0) {

        if (antalSpelare == 1) {
            spelare1 = Integer.parseInt(JOptionPane.showInputDialog(null,"(Bara nummer!) Välj Sten(1) Sax(2) eller Påse(3)"));
            dator = rand.nextInt(3)+1;

            if (spelare1 == dator) {
                JOptionPane.showMessageDialog(null,"Ni båda valde samma sak");
                rundor++;
            }
            else if (spelare1 == 1 && dator == 2) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 1 && dator == 3) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde påse" + "\n" + "Dator vinner!");
                datorpoang++;
            }
            else if (spelare1 == 2 && dator == 3) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 2 && dator == 1) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde påse" + "\n" + "Dator vinner!");
                datorpoang++;
            }
            else if (spelare1 == 3 && dator == 1) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 3 && dator == 2) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och dator valde påse" + "\n" + "Dator vinner!");
                datorpoang++;
            }
            rundor--;
            JOptionPane.showMessageDialog(null, "Resultat: " + "Spelare 1 har " + poang1 + " poäng och datorn har " + datorpoang + " poäng!" + "\n" + rundor + " Rundor kvar!" );
            if (rundor == 0 && poang1 > datorpoang) {
                JOptionPane.showMessageDialog(null, "Spelare 1 vinner hela spelet!");
            }
                else if (rundor == 0 && datorpoang > poang1) {
                    JOptionPane.showMessageDialog(null, "Datorn vinner hela spelet!");
                }
            }
        if (antalSpelare == 2) {
            spelare1 = Integer.parseInt(JOptionPane.showInputDialog(null,"(Bara nummer!) Spelare 1 välj Sten(1) Sax(2) eller Påse(3)"));
            spelare2 = Integer.parseInt(JOptionPane.showInputDialog(null,"(Bara nummer!) Spelare 2 välj Sten(1) Sax(2) eller Påse(3)"));

            if (spelare1 == spelare2) {
                JOptionPane.showMessageDialog(null,"Ni båda valde samma sak");
                rundor++;
            }
            else if (spelare1 == 1 && spelare2 == 2) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 1 && spelare2 == 3) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde påse" + "\n" + "Spelare 2 vinner!");
                poang2++;
            }
            else if (spelare1 == 2 && spelare2 == 3) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 2 && spelare2 == 1) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde påse" + "\n" + "Spelare 2 vinner!");
                poang2++;
            }
            else if (spelare1 == 3 && spelare2 == 1) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde sax!" + "\n" + "Spelare 1 vinner!");
                poang1++;
            }
            else if (spelare1 == 3 && spelare2 == 2) {
                JOptionPane.showMessageDialog(null,"Spelare 1 valde sten och Spelare 2 valde påse" + "\n" + "Spelare 2 vinner!");
                poang2++;
            }
            rundor--;
            JOptionPane.showMessageDialog(null, "Resultat: " + "Spelare 1 har " + poang1 + " poäng och Spelare 2 har " + poang2 + " poäng!" + "\n" + rundor + " Rundor kvar!" );
            if (rundor == 0 && poang1 > poang2) {
                JOptionPane.showMessageDialog(null, "Spelare 1 vinner hela spelet!");
            }
            else if (rundor == 0 && poang2 > poang1) {
                JOptionPane.showMessageDialog(null, "Spelare 2 vinner hela spelet!");
            }
        }
        }
        }
    }


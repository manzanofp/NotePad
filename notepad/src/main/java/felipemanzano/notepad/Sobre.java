package felipemanzano.notepad;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Manzano
 */
public class Sobre extends JFrame {
    
    Sobre(){
        setBounds(100,100,500,400);
        setTitle("Sobre");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ImageIcon icone = new ImageIcon(getClass().getResource("notepad-icon.png"));
        setIconImage(icone.getImage());


        setLayout(null);

        JLabel iconeSobre = new JLabel(new ImageIcon(getClass().getResource("notepad-icon.png")));
        iconeSobre.setBounds(200,60,80,80);
        add(iconeSobre);

        JLabel textoSobre =  new JLabel("<html>Bloco de notas - utilize para guardar suas anotações<br>Desenvolvido por: Felipe Manzano </html>");
        textoSobre.setBounds(70,30,400,300);
        textoSobre.setFont(new Font(Font.MONOSPACED,Font.BOLD,16));
        add(textoSobre);
    }
    
    public static void main(String[] args) {
        new Sobre().setVisible(true);
    }
}
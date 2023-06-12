package felipemanzano.notepad;

import javax.swing.*;

/**
 *
 * @author Manzano
 */
public class Notepad extends JFrame{

    
    JMenuBar barraMenu = new JMenuBar();
    JMenu arquivo = new JMenu("Arquivo");
    JMenu editar = new JMenu("Editar");
    JMenu ajuda = new JMenu("Ajuda");
    
    Notepad(){
        setTitle("Bloco de Notas");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       add(barraMenu);
       barraMenu.add(arquivo);
       barraMenu.add(editar);
       barraMenu.add(ajuda);
    }
    
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}
                                                                                                                                                                
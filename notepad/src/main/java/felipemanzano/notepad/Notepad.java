package felipemanzano.notepad;

import javax.swing.*;

/**
 *
 * @author Manzano
 */
public class Notepad extends JFrame{

    
    JMenuBar barraMenu = new JMenuBar();
    
    Notepad(){
        setTitle("Bloco de Notas");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
    
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}
                                                                                                                                                                
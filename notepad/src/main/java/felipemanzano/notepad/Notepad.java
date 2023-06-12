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
    
    JMenuItem novoArquivo = new JMenuItem("Novo");
    JMenuItem abrirArquivo = new JMenuItem("Abrir");
    JMenuItem salvarArquivo = new JMenuItem("Salvar");
    JMenuItem sair = new JMenuItem("sair");
    
    JMenuItem cortar = new JMenuItem("Cortar");
    JMenuItem copiar = new JMenuItem("Copiar");
    JMenuItem colar = new JMenuItem("Colar");
    JMenuItem selecionarTudo = new JMenuItem("Selecionar Tudo");
    
    JMenuItem sobre = new JMenuItem("Sobre");
    
    Notepad(){
        setTitle("Bloco de Notas");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       setJMenuBar(barraMenu);
       barraMenu.add(arquivo);
       barraMenu.add(editar);
       barraMenu.add(ajuda);
    }
    
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}
                                                                                                                                                                
package felipemanzano.notepad;

import javax.swing.*;

/**
 *
 * @author Manzano
 */
public class Notepad extends JFrame{

    //criação da barra de menu.
    JMenuBar barraMenu = new JMenuBar();
    JMenu arquivo = new JMenu("Arquivo");
    JMenu editar = new JMenu("Editar");
    JMenu ajuda = new JMenu("Ajuda");
    
    //criando as funções dos menus.
    //Menu Arquivo
    JMenuItem novoArquivo = new JMenuItem("Novo");
    JMenuItem abrirArquivo = new JMenuItem("Abrir");
    JMenuItem salvarArquivo = new JMenuItem("Salvar");
    JMenuItem sair = new JMenuItem("sair");
    
    //Menu Editar
    JMenuItem cortar = new JMenuItem("Cortar");
    JMenuItem copiar = new JMenuItem("Copiar");
    JMenuItem colar = new JMenuItem("Colar");
    JMenuItem selecionarTudo = new JMenuItem("Selecionar Tudo");
    
    //Menu Sobre
    JMenuItem sobre = new JMenuItem("Sobre");

    //Area de texto
    JTextArea areaTexto = new JTextArea();
    
    Notepad(){
        setTitle("Bloco de Notas");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //configurando o logo da imagem
        ImageIcon icone = new ImageIcon(getClass().getResource("notepad-icon.png"));
        setIconImage(icone.getImage());

        //selecionando a barra de menu na tela
        setJMenuBar(barraMenu);
       
       //selecionando qual função cada menu tem que fazer.
       barraMenu.add(arquivo);
       barraMenu.add(editar);
       barraMenu.add(ajuda);
       
       arquivo.add(novoArquivo);
       arquivo.add(abrirArquivo);
       arquivo.add(salvarArquivo);
       arquivo.add(sair);
       
       editar.add(cortar);
       editar.add(copiar);
       editar.add(colar);
       editar.add(selecionarTudo);
       
       ajuda.add(sobre);

       //Configurando a função para rolar a área de texto.
       JScrollPane scroll = new JScrollPane(areaTexto);
       add(scroll);
    }
    
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}
                                                                                                                                                                
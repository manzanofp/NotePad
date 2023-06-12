package felipemanzano.notepad;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Manzano
 */
public class Notepad extends JFrame implements ActionListener{

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

       //Configurando a função para rolar a área de texto e seu funcionamento.
       JScrollPane scroll = new JScrollPane(areaTexto);
       add(scroll);
       scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

       //Configuração da área de texto
       areaTexto.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
       areaTexto.setLineWrap(true);
       areaTexto.setWrapStyleWord(true);

       novoArquivo.addActionListener(this);
       abrirArquivo.addActionListener(this);
       salvarArquivo.addActionListener(this);
       sair.addActionListener(this);
       cortar.addActionListener(this);
       copiar.addActionListener(this);
       colar.addActionListener(this);
       selecionarTudo.addActionListener(this);
       sobre.addActionListener(this);
        
       
       
    }
    
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Novo")){
            areaTexto.setText(null);
        }else if(e.getActionCommand().equalsIgnoreCase("Abrir")){

             JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filtroTexto = new FileNameExtensionFilter("Somente Arquivos de texto (.txt)", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(filtroTexto);

            int acaoAbrir = fileChooser.showOpenDialog(null);
            if(acaoAbrir != JFileChooser.APPROVE_OPTION){
                return;
            }else{
                try{
                BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                areaTexto.read(reader,null);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }

        }else if(e.getActionCommand().equalsIgnoreCase("Salvar")){
            
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filtroTexto = new FileNameExtensionFilter("Somente Arquivos de texto (.txt)", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(filtroTexto);

            int acaoSalvar = fileChooser.showSaveDialog(null);
            if(acaoSalvar != JFileChooser.APPROVE_OPTION){
                return;
            }else{
                String nomeArquivo = fileChooser.getSelectedFile().getAbsolutePath().toString();
                if(!nomeArquivo.contains(".txt"))
                    nomeArquivo = nomeArquivo + ".txt";

                try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
                areaTexto.write(writer);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }

        }else if(e.getActionCommand().equalsIgnoreCase("Sair")){
            System.exit(0);
        }else if(e.getActionCommand().equalsIgnoreCase("Cortar")){
            areaTexto.cut();
        }else if(e.getActionCommand().equalsIgnoreCase("Copiar")){
            areaTexto.copy();
        }else if(e.getActionCommand().equalsIgnoreCase("Colar")){
            areaTexto.paste();
        }else if(e.getActionCommand().equalsIgnoreCase("Selecionar Tudo")){
            areaTexto.selectAll();
        }else if(e.getActionCommand().equalsIgnoreCase("Sobre")){
            new Sobre().setVisible(true);
        }
    }
}                                                                                                                                                        
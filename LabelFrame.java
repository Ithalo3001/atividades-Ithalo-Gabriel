// Figura 14.6: LabelFrame.java
//Demonstrando a classe JLabel
import java.awt.FlowLayout;//especifica como o componentes são organizados
import javax.swing.JFrame; //fornece recursos básicos da janela
import javax.swing.JLabel; //exibe texto e imagens
import javax.swing.SwingConstants; //constantes comuns utilizadas com swing
import javax.swing.Icon; //interface utilizada para manipular imagem
import javax.swing.ImageIcon; //carrega imagens

public class LabelFrame extends JFrame
{
    private JLabel label1; //Jlabel apenas com texto
    private JLabel label2; //Jlabel construido com texto e ícone
    private JLabel label3; //Jlabel com texto e ícone adicionados

    // construtor LabelFrame adiciona Jlabels a JFrame
    public LabelFrame()
    {
        super("Testing JLable");
        setLayout(new FlowLayout()); //configura o layout de frame

        // Construtor Jlabel com um argumento de string
        label1 = new JLabel("Label with text");
        label1.setToolTipText(" This is label1");
        add(label1); //adiciona o label1 ao frame

        //Construtor Jlabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug,
                SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); //adicionalabel2 ao JFrame

        label3 = new JLabel(); //Construtor Jlabel sem argumentos
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug); //adiciona o icone ao Jlabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add( label3 ); //adiciona label3 ao JFrame
    } //fim do construtorLabelFrame
} //fim da classe LabelFrame

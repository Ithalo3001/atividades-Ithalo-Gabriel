package eventhandlingexample2.java;

public class NewClass {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample2 extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public EventHandlingExample2() {
        setTitle("Exemplo de Tratamento de Eventos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Criação dos componentes
        label = new JLabel("Nenhum texto inserido");
        textField = new JTextField(15);
        button = new JButton("Atualizar Rótulo");

        // Adiciona componentes ao frame
        add(label);
        add(textField);
        add(button);

        // Adiciona listener ao botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        EventHandlingExample2 frame = new EventHandlingExample2();
        frame.setVisible(true);
    }
}
    
}

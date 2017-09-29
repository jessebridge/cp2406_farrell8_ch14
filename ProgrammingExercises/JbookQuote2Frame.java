import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JbookQuote2Frame extends JFrame implements ActionListener {
    final int width = 300;
    final int height = 300;


    public JbookQuote2Frame() {
        super("Book Quote");
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(3);
        setLayout(new GridBagLayout());
        JPanel panel = new JPanel();
        JLabel quote = new JLabel("wub wub wub wub");
        JButton b1 = new JButton("click me");
        b1.setBounds(150, 150, 100, 30);
        panel.add(quote);
        add(b1);
        add(panel);

        b1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"skrillex made this");

    }
}
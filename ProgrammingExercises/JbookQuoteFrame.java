import javax.swing.*;
import java.awt.*;

public class JbookQuoteFrame extends JFrame {
    final int width = 300;
    final int height = 300;


    public JbookQuoteFrame(){
        super("Book Quote");
        setVisible(true);
        setSize(width,height);
        setDefaultCloseOperation(3);
        setLayout(new GridBagLayout());
        JPanel panel = new JPanel();
        JLabel quote = new JLabel("wub wub wub wub");
        panel.add(quote);
        add(panel);
    }

}

package convertor.bind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {

    private JButton buttonCToF;
    private JButton buttonFToC;
    private JTextField fToC;
    private JTextField cToF;
    private JPanel panelConverter;

    public TemperatureConverter() {
        buttonCToF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = cToF.getText();
                double d = Double.parseDouble(c);
                double ca = (d * 1.8) + 32;
                String str = String.valueOf(ca);
                fToC.setText(str);
            }
        });
        buttonFToC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = fToC.getText();
                double d = Double.parseDouble(f);
                double fa = (d - 32) / 1.8;
                String str = String.valueOf(fa);
                cToF.setText(str);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new TemperatureConverter().panelConverter);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,350);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}


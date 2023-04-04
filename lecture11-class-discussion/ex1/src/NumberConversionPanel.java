import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * An exercise to create a GUI to allow the user to convert a decimal number to a binary number by clicking on a conversion button.
 */

public class NumberConversionPanel extends JPanel implements ActionListener {
        private JTextField decimalTextField;
    private JTextField convertedBinaryNumber;

    public NumberConversionPanel(){
        //TODO: Add the components to the window content
        JLabel decimalLabel = new JLabel("Decimal number:");
        this.add(decimalLabel);

        decimalTextField = new JTextField(10);
        this.add(decimalTextField);


        JButton button = new JButton("Convert");
        this.add(button);
        button.addActionListener(this);
        JLabel convertLabel = new JLabel("Converted binary number:");
        this.add(convertLabel);
        convertedBinaryNumber = new JTextField(10);
        this.add(convertedBinaryNumber);
        //Comment appeared immediately



    }

    public String convertDecimalToBinary(int number){
        String binary = "";
        int reminder;
        while(number > 0){
            reminder = number % 2;
            binary = reminder + "" + binary;
            number = number / 2;
        }

        return binary;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setLocation(100,100);
                frame.setTitle("Number conversion");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //TODO: Uncomment this after you have completed the task.
                NumberConversionPanel panel = new NumberConversionPanel();
                panel.setPreferredSize(new Dimension(400,80));
                panel.requestFocusInWindow();
                frame.getContentPane().add(panel);

                frame.pack();
                frame.setVisible(true);


            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        convertedBinaryNumber.setText(convertDecimalToBinary(Integer.parseInt(decimalTextField.getText())));

    }
}

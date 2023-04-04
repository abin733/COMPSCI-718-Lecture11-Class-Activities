import javax.swing.*;


/**
 * An exercise to create a GUI to allow the user to convert a decimal number to a binary number by clicking on a conversion button.
 */

public class NumberConversionPanel {


    public NumberConversionPanel(){
        //TODO: Add the components to the window content


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
/*                NumberConversionPanel panel = new NumberConversionPanel();
                panel.setPreferredSize(new Dimension(400,80));
                panel.requestFocusInWindow();
                frame.getContentPane().add(panel);*/

                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}

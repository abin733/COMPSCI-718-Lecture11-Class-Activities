import javax.swing.*;
import java.awt.*;

/**
 * An exercise to jump the blue dot to a random position inside the window by clicking on the "Jump!" button.
 */

public class JumpPanel {
    private JButton jumpButton;
    private int x, y;
    private final int DOT_WIDTH = 50;
    private final int DOT_HEIGHT = 50;

    public JumpPanel(){
        // TODO: Add the Jump! button

    }

    public void paintComponent(Graphics g){
        // TODO: Draw the blue dot



    }


    private void createRandomDot() {
        /*TODO: Calculate the random position for the blue dot.
         * Please ensure the entire dot appears inside the window.
         * Hint: getWidth() and getHeight() methods might be useful
         */


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setLocation(100,100);
                frame.setTitle("Jumping ball");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //TODO: Uncomment this after you have completed the task.
/*                JumpPanel panel = new JumpPanel();
                panel.setPreferredSize(new Dimension(500,500));
                panel.requestFocusInWindow();
                frame.getContentPane().add(panel);*/
                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}

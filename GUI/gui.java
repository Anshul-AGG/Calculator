package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a label
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        panel.add(button);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
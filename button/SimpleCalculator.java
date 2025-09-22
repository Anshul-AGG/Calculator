package button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField displayField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, eqButton, delButton, clrButton, negButton;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    SimpleCalculator() {
        this.setTitle("Calculator");
        this.setSize(420, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        displayField = new JTextField();
        displayField.setBounds(50, 25, 300, 50);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setEditable(false);
        this.add(displayField);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        negButton = new JButton("±");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = eqButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (JButton btn : functionButtons) {
            btn.addActionListener(this);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
        }

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Add buttons to panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);
        panel.add(negButton);
        panel.add(delButton);
        panel.add(clrButton);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                displayField.setText(displayField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            displayField.setText(displayField.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '+';
            displayField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '-';
            displayField.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '*';
            displayField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '/';
            displayField.setText("");
        }

        if (e.getSource() == eqButton) {
            num2 = Double.parseDouble(displayField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num2 != 0 ? num1 / num2 : 0;
                    break;
            }

            displayField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            displayField.setText("");
        }

        if (e.getSource() == delButton) {
            String text = displayField.getText();
            if (!text.isEmpty()) {
                displayField.setText(text.substring(0, text.length() - 1));
            }
        }

        if (e.getSource() == negButton) {
            String text = displayField.getText();
            if (!text.isEmpty()) {
                double value = Double.parseDouble(text);
                value *= -1;
                displayField.setText(String.valueOf(value));
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import fibonacci.FibonacciCtlr.FibonacciActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author luzuko
 */
public class FibonacciView extends JFrame{
    private final JButton getSum, generateSequence;
    private final JTextField from, to;
    private final JTextArea sumOutput, generatedOutput;
    
    FibonacciView(){
        JPanel mainPanel = new JPanel();
        JPanel panel = new JPanel();
        JScrollPane scroll;
        mainPanel.setLayout(new GridLayout(2, 2));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        this.setSize(600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(new GridLayout(2, 2));
        
        JLabel label = new JLabel("Range");
        getSum = new JButton("Sum of even numbers");
        generateSequence = new JButton("Generate Sequence");
        
        from = new JTextField(5);
        from.setToolTipText("From Value");
        to = new JTextField(5);
        to.setToolTipText("To Value");
        sumOutput = new JTextArea(5,10);
        sumOutput.setEditable(true);
        sumOutput.setLineWrap(true);
        sumOutput.setWrapStyleWord(true);
        scroll = new JScrollPane(sumOutput);
        generatedOutput = new JTextArea(5,10);
        generatedOutput.setEditable(false);
        
        panel.add(label);
        panel.add(from);
        panel.add(to);
        this.add(panel,BorderLayout.NORTH);
        mainPanel.add(generateSequence);
        mainPanel.add(generatedOutput);
        mainPanel.add(getSum);
        mainPanel.add(sumOutput);
        this.add(mainPanel, BorderLayout.CENTER);
        
    }

    public JTextArea getSumOutput() {
        return sumOutput;
    }

    public JTextArea getGeneratedOutput() {
        return generatedOutput;
    }

    public JButton getGetSum() {
        return getSum;
    }

    public JButton getGenerateSequence() {
        return generateSequence;
    }
    
    public int getFrom(){
        return Integer.valueOf(from.getText());
    }
    
    public int getTo(){
        return Integer.valueOf(to.getText());
    }
    
    public void setSumOutput(String output){
        sumOutput.setText(output);
    }
    
    void setGeneratedOutput(String output) {
        generatedOutput.setText(output);
    }

    void addFibonacciListener(FibonacciActionListener listener){
        getSum.addActionListener(listener);
        generateSequence.addActionListener(listener);
    }
    
    void displayErrorMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
}

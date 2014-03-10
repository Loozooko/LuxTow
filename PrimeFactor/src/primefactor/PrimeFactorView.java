/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactor;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author luzuko
 */
public class PrimeFactorView extends JFrame
{
    private JButton primeFactors,largestPrimeFactor,clearPrimeFactors,clearLargestPrimes, clearAll;
    private JTextField number,primeFactorsDisplay, largestPrimeFactorDisplay;

    public PrimeFactorView() throws HeadlessException 
    {
        this.setLayout(new FlowLayout());
        this.setTitle("Prime Factors");
        this.setSize(240, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel enterNumber = new JLabel("Enter number:");
        number = new JTextField(10);
        primeFactors = new JButton("Display Prime Factors");
        JLabel primefactorLabel = new JLabel("Prime Factors:");
        primeFactorsDisplay = new JTextField(10);
        primeFactorsDisplay.setEditable(false);
        this.add(enterNumber);
        this.add(number);
        this.add(primeFactors);
        this.add(primefactorLabel);
        this.add(primeFactorsDisplay);
        
        largestPrimeFactor = new JButton("Display Largest Prime Factor");
        JLabel lagestPrimefactorLabel = new JLabel("Largerst Prime Factors:");
        largestPrimeFactorDisplay = new JTextField(10);
        largestPrimeFactorDisplay.setEditable(false);
        this.add(largestPrimeFactor);
        this.add(lagestPrimefactorLabel);
        this.add(largestPrimeFactorDisplay);
        
        clearPrimeFactors = new JButton("Clear Prime Factors");
        clearLargestPrimes = new JButton("Clear Largest Prime Factor");
        clearAll = new JButton("Clear all");    
        this.add(clearLargestPrimes);
        this.add(clearPrimeFactors);
        this.add(clearAll);
    }

    public JButton getClearAll() 
    {
        return clearAll;
    }
    
    void addPrimeFactorListener(ActionListener listener)
    {
        getPrimeFactors().addActionListener(listener);
        getLargestPrimeFactor().addActionListener(listener);
        getClearLargestPrimes().addActionListener(listener);
        getClearPrimeFactors().addActionListener(listener);
        getClearAll().addActionListener(listener);
    }

    public JTextField getPrimeFactorsDisplay() 
    {
        return primeFactorsDisplay;
    }

    public void setPrimeFactorsDisplay(JTextField primeFactorsDisplay) 
    {
        this.primeFactorsDisplay = primeFactorsDisplay;
    }

    public JTextField getLargestPrimeFactorDisplay() 
    {
        return largestPrimeFactorDisplay;
    }

    public void setLargestPrimeFactorDisplay(JTextField largestPrimeFactorDisplay) 
    {
        this.largestPrimeFactorDisplay = largestPrimeFactorDisplay;
    }

    public JButton getPrimeFactors() 
    {
        return primeFactors;
    }

    public void setPrimeFactors(JButton primeFactors) 
    {
        this.primeFactors = primeFactors;
    }

    public JButton getLargestPrimeFactor() 
    {
        return largestPrimeFactor;
    }

    public void setLargestPrimeFactor(JButton largestPrimeFactor) 
    {
        this.largestPrimeFactor = largestPrimeFactor;
    }

    public JButton getClearPrimeFactors() 
    {
        return clearPrimeFactors;
    }

    public void setClearPrimeFactors(JButton clearPrimeFactors) 
    {
        this.clearPrimeFactors = clearPrimeFactors;
    }

    public JButton getClearLargestPrimes() 
    {
        return clearLargestPrimes;
    }

    public void setClearLargestPrimes(JButton clearLargestPrimes) 
    {
        this.clearLargestPrimes = clearLargestPrimes;
    }

    public JTextField getNumber() {
        return number;
    }

    public void setNumber(JTextField number) {
        this.number = number;
    }
}

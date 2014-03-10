/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luzuko
 */
public class PrimeFactorCtlr 
{
    private PrimeFactorModel model;
    private PrimeFactorView view;

    PrimeFactorCtlr(PrimeFactorModel model, PrimeFactorView view) 
    {
        this.model = model;
        this.view = view;
        this.view.addPrimeFactorListener(new PrimeFactorListener());
    }      

    class PrimeFactorListener implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==view.getPrimeFactors())
            {
                if(model.getPrimeFactors().isEmpty())
                {
                    if(view.getNumber().getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(view, "Please enter a number to be used");
                    }
                    else
                    {
                        long number = Long.valueOf(view.getNumber().getText());
                        model.generatePrimeFactors(number);
                    }
                }
                String display="";
                    for(long primeFactor:model.getPrimeFactors()){
                        if(!display.equals(""))
                            display+=", ";
                        display+=primeFactor;
                    }
                    view.getPrimeFactorsDisplay().setText(display);
            }
            else
                if(e.getSource()==view.getLargestPrimeFactor())
                {
                    if(model.getPrimeFactors().isEmpty())
                    {
                        if(view.getNumber().getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(view, "Please enter a number to be used");
                        }
                        else
                        {
                            long number = Long.valueOf(view.getNumber().getText());
                            model.generatePrimeFactors(number);
                        }
                    }
                    view.getLargestPrimeFactorDisplay().setText(String.valueOf(model.getLargestPrimeFactor()));
                }
            else
                if(e.getSource()==view.getClearPrimeFactors())
                {
                    view.getPrimeFactorsDisplay().setText("");
                }
            else
                if(e.getSource()==view.getClearLargestPrimes())
                {
                    view.getLargestPrimeFactorDisplay().setText("");
                }
            else
                if(e.getSource()==view.getClearAll())
                {
                    view.getPrimeFactorsDisplay().setText("");
                    view.getLargestPrimeFactorDisplay().setText("");
                    view.getNumber().setText("");
                    model.setLargestPrimeFactor(0L);
                    model.setPrimeFactors(new ArrayList<Long>());
                }    
        }
    }
    
}

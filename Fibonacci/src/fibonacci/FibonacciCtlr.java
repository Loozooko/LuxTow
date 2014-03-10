/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author luzuko
 */
public class FibonacciCtlr 
{
    private final FibonacciView view;
    private final FibonnaciModel model;
    
    public FibonacciCtlr(FibonacciView view, FibonnaciModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.addFibonacciListener(new FibonacciActionListener());
    }
    
    class FibonacciActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==view.getGetSum())
            {
                int sum = model.getSum();
                if(sum==0)
                {
                    view.displayErrorMessage("You must first generate a sequence.");
                }
                else
                {
                    view.setSumOutput(String.valueOf(sum));
                }
                
            }
            
            if(e.getSource()==view.getGenerateSequence())
            {
                try{
                    int from = view.getFrom();
                    int to = view.getTo();

                    if(from>to)
                    {
                        view.displayErrorMessage("The From value should not be larger than the To value");
                    }
                    else
                    {
                        model.generate(from, to);
                            String output = "";
                            for(int item: model.getSequence())
                            {
                                if(!output.equals(""))
                                    output+=", ";
                                output += item;
                            }
                            view.setGeneratedOutput(output);
                    }
                }
                catch(Exception exp){
                    view.displayErrorMessage("Please enter both To and From value then click Generate");
                }
                        
            }
        }
        
    }
}

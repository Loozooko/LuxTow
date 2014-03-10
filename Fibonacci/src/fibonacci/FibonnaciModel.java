/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.util.ArrayList;

/**
 *
 * @author luzuko
 */
public class FibonnaciModel 
{
    private ArrayList<Integer> sequence = new ArrayList<>();
    
    public void generate(int from, int to)
    {
        ArrayList<Integer>sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        boolean Break = false;
        while(sequence.get(sequence.size()-1)<to)
        {
            if(sequence.get(sequence.size()-2)+sequence.get(sequence.size()-1)<to){
            sequence.add(sequence.get(sequence.size()-2)+sequence.get(sequence.size()-1));
            }
            else
            {
                break;
            }
        }
        this.sequence.clear();
        for(int item: sequence)
            if(item>=from)
                this.sequence.add(item);
    }

    public ArrayList<Integer> getSequence() 
    {
        return sequence;
    }

    public void setSequence(ArrayList<Integer> sequence) 
    {
        this.sequence = sequence;
    }
    
    public int getSum(){
        if(!this.sequence.isEmpty()){
            int sum = 0;
            for(int item :this.sequence)
                if(item%2==0)
                    sum += item;
            return sum;
        }
        else
        {
            return 0;
        }
    }
}

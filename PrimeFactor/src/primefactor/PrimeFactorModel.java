/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactor;

import java.util.ArrayList;

/**
 *
 * @author luzuko
 */
public class PrimeFactorModel 
{ 
    private long largestPrimeFactor;
    private long number;
    private ArrayList<Long> primeFactors;
    
    public PrimeFactorModel(){
        primeFactors = new ArrayList<>();
    }

    public ArrayList<Long> getPrimeFactors() {
        return primeFactors;
    }

    public long getLargestPrimeFactor() 
    {
        return largestPrimeFactor;
    }

    void setLargestPrimeFactor(long largestPrimeFactor) 
    {
        this.largestPrimeFactor = largestPrimeFactor;
    }
    
    //check whether an int is divisible be another int
    boolean isDivisible(long divisee, long divisor)
    {
        return (divisee%divisor==0);
    }
    
    //checks whether an int is prime or not
    boolean isPrime(long number)
    {
        if(number%2==0){
            if(number==2)
                return true;
            return false;
        }
        
        for(long i=3;i*i<number;i+=2) 
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
    
    public void generatePrimeFactors(long number) throws NumberFormatException
    {
        setNumber(number);
        long divisor=2L;
        while(number!=1L)
        {
            if(!isPrime(number))
            {
                if(isPrime(divisor)){
                    if(isDivisible(number, divisor))
                    {
                        primeFactors.add(divisor);
                        if(getLargestPrimeFactor()<divisor)
                            setLargestPrimeFactor(divisor);
                        number/=divisor;
                        divisor=2L;
                    }
                    else
                    {
                        divisor++;
                    }
                }
                else
                {
                    divisor++;
                }
            }
            else{
                if(getLargestPrimeFactor()<number)
                    setLargestPrimeFactor(number);
                primeFactors.add(number);
                number/=number;
            }
        }
    }

    public void setPrimeFactors(ArrayList<Long> primeFactors) {
        this.primeFactors = primeFactors;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

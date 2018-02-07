/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg017_recursion_overload;

/**
 *
 * @author compsci
 * @version 1.0
 * @param numbers in the form of an int, for various recursions including: down, up, and Evens
 * @returns blanks in the console to space out the recursions
 */
public class StartRecursion {
    
    public static void main(String[] args){
        int n = 10;
        recurse(n);
        System.out.println();
        n = 0;
        recurseUp(n);
        System.out.println();
        int startValue = 0;
        int stopValue = 50;
        recurseEvens(startValue, stopValue);
    }
    /**
     * Displays all numbers from n through 0
     * 
     * @param int "n"
     * 
     * @return ints that have been recursed
     */
    private static void recurse(int n) {
        System.out.println("We have done recurse " + n + " time(s)");
        n--;
        if (n >= 0){
            recurse(n);
        }
        
        
        
    }
    /**
     * Displays all numbers starting from the n int to 10 or whatever number you want
     * 
     *
     * @param int "n"
     * 
     * @return ints that have been recursed
     */
    private static void recurseUp(int n) {
        System.out.println("recurseUp value is: " + n + " this time.");
        n++;
        if (n <= 10){
            recurseUp(n);
        }
        
        
        
    }
    /**
     * Displays even numbers
     * 
     * @param startValue
     * @param stopValue 
     * 
     * @return ints that have been recursed
     */
    
    //overload define: methods have the same name!!
    //but different pass paramaters
    //and thats how java tells them apart
    private static void recurseEvens(int startValue, int stopValue){
        
        if (startValue % 2 != 0 ){
            recurseEvens(startValue +1 , stopValue);
            
        }else if (startValue <stopValue){
        System.out.println(startValue);
        recurseEvens(startValue+2,stopValue);
        
        }else{
            System.out.println("Finished");
            
        }
       
    }
    
    
} // end of class

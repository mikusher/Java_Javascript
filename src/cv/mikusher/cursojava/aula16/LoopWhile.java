/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula16;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1; //count ou cont
        int max = 10;
        
        System.out.println("Aumentar ate o maximo " +max);
        
        while(i <= max){
            System.out.println("Valor de i: " +i);
            i++; //i = i + 1
        }
    }
    
}

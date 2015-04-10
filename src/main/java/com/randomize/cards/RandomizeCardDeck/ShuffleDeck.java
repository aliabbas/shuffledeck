package com.randomize.cards.RandomizeCardDeck;

import java.util.Random;

/**
 * Shuffle array using Fisher-Yates - for fun and profit
 *
 */
public class ShuffleDeck {
    public static void main( String[] args ) {
        int [] arr = new int[52];
        
        // initialize array 1 to 52
        for(int i = 0; i < 52; i++) {
        	arr[i] = i + 1;
        }
        
        // shuffle array method
        shuffleArray(arr);
        
        // print shuffled array
        for(int j = 0; j < arr.length; j++) {
        	System.out.println(arr[j]);
        }
    }
    
    public static void shuffleArray(int [] arr) {
    	Random rnd = new Random();
        for(int i = arr.length - 1; i > 0; i--) {
        	int j = rnd.nextInt(i);
        	// swap between random and i (index)
        	int temp = arr[j];
        	arr[j] = arr[i];
        	arr[i] = temp;
        }
    }
}

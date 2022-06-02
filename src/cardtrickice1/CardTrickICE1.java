/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 * Liliana Mantilla Guevara ID 991633617
 * @author sivagamasrinivasan,May 23rd
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        Random generateCards = new Random();
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            
            c1.setValue(generateCards.nextInt(13) + 1);//use a method to generate random *13
            c1.setSuits(Card.SUITS[generateCards.nextInt(4)]);//random method suit 
            magicHand[i] = c1;
            System.out.println(c1);
        }
        
        
        //step 2:take input 
       /* Scanner in = new Scanner (System.in);
        System.out.println("Please pick a card:");
        System.out.println("What is suit: Hearts, Diamond, Spades or Clubs?");
        String chooseSuitCard = in.next();
        System.out.println("What is value? (between 1 to 13)");
        int chooseNumCard = in.nextInt();*/
        
        //step 3: match with array 
        
        Card cardSelected = new Card(); 
        
        /*cardSelected.setSuits(chooseSuitCard);
        cardSelected.setValue(chooseNumCard);*/
        
        Card cardSelected = new Card(); 
        cardSelected.setValue(4);
        cardSelected.setSuits("Clubs");
    
        boolean foundCard = false;
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == cardSelected.getValue() && magicHand1.getSuits().equalsIgnoreCase(cardSelected.getSuits())) {
                foundCard = true;
               break;
            }
                      
         }
             
         if(foundCard)
                System.out.println("Congratulations, card found in magicHand!");
            else
                System.out.println("Sorry, card not found in magicHand");
    } 
}

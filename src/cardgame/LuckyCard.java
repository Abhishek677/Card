package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.*;

/**
 * Name: Abhishek Jassal
 * Student ID:991605946
 * DATE:9/feb/2021
 * @author Abhishek
 */

public class LuckyCard
{
  public static Card[] generateCards(int numCards,Suit[] cardSuits,Value[] cardValues)
    {
      Random random = new Random();
      
       Card[] magicHand = new Card[numCards];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Suit suit = cardSuits[random.nextInt(cardSuits.length)];
            Value value = cardValues[random.nextInt(cardValues.length)];
            
            Card c = new Card(suit,value);
            magicHand[i] = c;
            
        }
        return magicHand;

        
    }
    
    }

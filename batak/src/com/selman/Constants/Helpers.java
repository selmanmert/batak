package com.selman.Constants;

import com.selman.cards.Card;
import com.selman.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by z003sc9a on 25.09.2017.
 */
public class Helpers
{
    public static List<Card> putCardsIntoDeck(List<Card> deck, List<Card> specificTypeCards)
    {
        for (int i = 0; i < Constant.MAX_CARDS_PER_TYPE; i++)
        {
            deck.add(specificTypeCards.get(i));
        }
        return deck;
    }

    public static List<Card> mixCardsIntheDeck(List<Card> deck)
    {
        Random rand = new Random();
        List<Card> newDeck = new ArrayList<>(Constant.MAX_CARDS);

        for (int i = 52; i > 0; i--)
        {
            int n = rand.nextInt(i);


            newDeck.add(deck.get(n));
            deck.remove(n);
        }

        return newDeck;
    }

    public static void dealCards(List<Card> deck, Player player1, Player player2, Player player3, Player player4)
    {
        int k1 = 4;
        int k2 = 3;

        int pointer = 0;

        for (int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                firstRoundFour(deck, player1, k1, pointer);
                pointer = pointer + 4;
                firstRoundFour(deck, player2, k1, pointer);
                pointer = pointer + 4;
                firstRoundFour(deck, player3, k1, pointer);
                pointer = pointer + 4;
                firstRoundFour(deck, player4, k1, pointer);
                pointer = pointer + 4;
            } else
            {
                otherRoundsThree(deck, player1, k2, pointer);
                pointer = pointer + 3;
                otherRoundsThree(deck, player2, k2, pointer);
                pointer = pointer + 3;
                otherRoundsThree(deck, player3, k2, pointer);
                pointer = pointer + 3;
                otherRoundsThree(deck, player4, k2, pointer);
                pointer = pointer + 3;
            }
        }
    }

    private static void firstRoundFour(List<Card> deck, Player player, int k, int pointer)
    {
        for (int p = 0; p < k; p++)
        {
            player.getPlayerCards().add(deck.get(pointer));
            pointer = pointer + 1;
        }
    }

    private static void otherRoundsThree(List<Card> deck, Player player, int k, int pointer)
    {
        for (int p = 0; p < k; p++)
        {
            player.getPlayerCards().add(deck.get(pointer));
            pointer = pointer + 1;
        }
    }

}

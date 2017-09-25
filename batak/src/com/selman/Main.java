package com.selman;

import com.selman.Constants.Constant;
import com.selman.cards.Card;
import com.selman.factory.CardFactory;
import com.selman.players.Player;

import java.util.ArrayList;
import java.util.List;

import static com.selman.Constants.Helpers.dealCards;
import static com.selman.Constants.Helpers.mixCardsIntheDeck;
import static com.selman.Constants.Helpers.putCardsIntoDeck;

public class Main
{

    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        CardFactory cardFactory = new CardFactory();
        List<Card> newSinekCardSet = cardFactory.getCardSet(Constant.SINEK);
        List<Card> newMacaCardSet = cardFactory.getCardSet(Constant.MACA);
        List<Card> newKaroCardSet = cardFactory.getCardSet(Constant.KARO);
        List<Card> newKupaCardSet = cardFactory.getCardSet(Constant.KUPA);

        List<Card> deck = new ArrayList<>(Constant.MAX_CARDS);

        deck = putCardsIntoDeck(deck, newSinekCardSet);
        deck = putCardsIntoDeck(deck, newMacaCardSet);
        deck = putCardsIntoDeck(deck, newKaroCardSet);
        deck = putCardsIntoDeck(deck, newKupaCardSet);

        deck = mixCardsIntheDeck(deck);
        dealCards(deck, player1, player2, player3, player4);


        System.out.println("Sinek is created..");

        // write your code here
    }
}

package com.selman.players;

import com.selman.Constants.Constant;
import com.selman.cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z003sc9a on 25.09.2017.
 */
public class Player
{
    private List<Card> playerCards = new ArrayList<Card>(Constant.MAX_CARDS_PER_PLAYER);

    public List<Card> getPlayerCards()
    {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards)
    {
        this.playerCards = playerCards;
    }


}

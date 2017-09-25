package com.selman.factory;

import com.selman.Constants.Constant;
import com.selman.cards.Card;
import com.selman.cards.KaroCard;
import com.selman.cards.KupaCard;
import com.selman.cards.MacaCard;
import com.selman.cards.SinekCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z003sc9a on 25.09.2017.
 */
public class CardFactory
{
    public List<Card> getCardSet(int type)
    {
        ArrayList<Card> list = new ArrayList<>();

        for (int i = 0; i < Constant.MAX_CARDS_PER_TYPE; i++)
        {
            switch (type)
            {
                case Constant.SINEK:
                    SinekCard newSinekCard = new SinekCard();
                    newSinekCard.setNumber(i + 1);
                    list.add(newSinekCard);
                    break;

                case Constant.MACA:
                    MacaCard newMacaCard = new MacaCard();
                    newMacaCard.setNumber(i + 1);
                    list.add(newMacaCard);
                    break;

                case Constant.KARO:
                    KaroCard newKaroCard = new KaroCard();
                    newKaroCard.setNumber(i + 1);
                    list.add(newKaroCard);
                    break;

                case Constant.KUPA:
                    KupaCard newKupaCard = new KupaCard();
                    newKupaCard.setNumber(i + 1);
                    list.add(newKupaCard);
                    break;
            }

        }


        return list;
    }

}

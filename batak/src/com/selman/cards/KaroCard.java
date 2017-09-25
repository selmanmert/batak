package com.selman.cards;

import com.selman.Constants.Constant;

/**
 * Created by z003sc9a on 25.09.2017.
 */
public class KaroCard implements Card
{
    private int number;

    @Override
    public int getType()
    {
        return Constant.KARO;
    }

    @Override
    public int getNumber()
    {
        return this.number;
    }

    @Override
    public void setNumber(int number)
    {
        this.number = number;

    }
}

package com.example.android.clickcounter;


import org.junit.Test;

public class ClickCounterTest {
    @Test
    public void verifyInitialCount(){
        assert new ClickCounter().getCount() == 0;
    }

    @Test
    public void verifyIncrementOnce(){
        assert createAndIncrementTimes(1).getCount() == 1;
    }

    @Test
    public void verifyIncrementTwice(){
        assert createAndIncrementTimes(2).getCount() == 2;
    }

    @Test
    public void verifyIncrement10Times(){
        assert createAndIncrementTimes(10).getCount() == 10;
    }

    public ClickCounter createAndIncrementTimes(int times){
        ClickCounter clickCounter = new ClickCounter();
        for(int i = 0; i < times; i++){
            clickCounter.increment();
        }
        return clickCounter;
    }

}

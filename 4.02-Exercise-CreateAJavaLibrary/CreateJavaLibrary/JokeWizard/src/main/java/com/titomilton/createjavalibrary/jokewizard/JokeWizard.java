package com.titomilton.createjavalibrary.jokewizard;

import com.titomilton.createjavalibrary.jokesmith.JokeSmith;

public class JokeWizard {
    public String getJoke(){
        return new JokeSmith().getJoke();
    }
}

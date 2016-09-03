package com.titomilton.createjavalibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.titomilton.createjavalibrary.jokesmith.JokeSmith;
import com.titomilton.createjavalibrary.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewJokeSmith = (TextView) findViewById(R.id.jokesmith);
        textViewJokeSmith.setText(new JokeSmith().getJoke());

        TextView textViewJokeWizard = (TextView) findViewById(R.id.jokewizard);
        textViewJokeWizard.setText(new JokeWizard().getJoke());

    }
}

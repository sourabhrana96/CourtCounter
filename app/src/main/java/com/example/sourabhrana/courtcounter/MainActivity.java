package com.example.sourabhrana.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int teamAScore=0;
    int teamBScore=0;

    public void threepointsA(View view){
        teamAScore+=3;
        displayteamA(teamAScore);
    }
    public void twopointsA( View view){
        teamAScore+=2;
        displayteamA(teamAScore);
    }
    public void freethrowA(View view ){
        teamAScore+=1;
        displayteamA(teamAScore);
    }
    public void displayteamA(int Score){
        TextView scoretextview= (TextView) findViewById(R.id.ScoreIDA);
        scoretextview.setText(String.valueOf(Score));
    }
    public void threepointsB(View view){
        teamBScore+=3;
        displayteamB(teamBScore);
    }
    public void twopointsB( View view){
        teamBScore+=3;
        displayteamB(teamBScore);
    }
    public void freethrowB(View view ){
        teamBScore+=3;
        displayteamB(teamBScore);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayteamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreIDB);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        teamAScore=0;
        teamBScore=0;
        displayteamA(teamAScore);
        displayteamB(teamBScore);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

package edu.desu.dsuappacademy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 9;
    int scoreB = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Team A starts

    public void teamAOneScore(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void teamATwoScore(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void teamAThreeScore(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    //Team B starts

    public void teamBOneScore(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void teamBTwoScore(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void teamBThreeScore(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    private void displayForTeamB(int score) {
        TextView counterView = (TextView) findViewById(R.id.team_b_score);
        counterView.setText(String.valueOf(score));
    }
    //Team B finish

    //Reset button code
    public void resetButton(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
package com.android.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runsTeamA = 0;
    int runsTeamB = 0;
    int outCountTeamA = 0;
    int overCountTeamA = 0;
    int outCountTeamB = 0;
    int overCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // displays runs for Team A
    public void displayForTeamA(int runs) {
        TextView total_run = findViewById(R.id.team_a_run);
        total_run.setText(String.valueOf(runs));
    }

    // displays runs for Team B
    public void displayForTeamB(int runs) {
        TextView total_run = findViewById(R.id.team_b_run);
        total_run.setText(String.valueOf(runs));
    }

    public void sixTeamA(View view) {
        runsTeamA = runsTeamA + 6;
        displayForTeamA(runsTeamA);
    }

    public void fourTeamA(View view) {
        runsTeamA = runsTeamA + 4;
        displayForTeamA(runsTeamA);
    }

    public void threeTeamA(View view) {
        runsTeamA = runsTeamA + 3;
        displayForTeamA(runsTeamA);
    }

    public void twoTeamA(View view) {
        runsTeamA = runsTeamA + 2;
        displayForTeamA(runsTeamA);
    }

    public void oneTeamA(View view) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
    }

    public void sixTeamB(View view) {
        runsTeamB = runsTeamB + 6;
        displayForTeamB(runsTeamB);
    }

    public void fourTeamB(View view) {
        runsTeamB = runsTeamB + 4;
        displayForTeamB(runsTeamB);
    }

    public void threeTeamB(View view) {
        runsTeamB = runsTeamB + 3;
        displayForTeamB(runsTeamB);
    }

    public void twoTeamB(View view) {
        runsTeamB = runsTeamB + 2;
        displayForTeamB(runsTeamB);
    }

    public void oneTeamB(View view) {
        runsTeamB = runsTeamB + 1;
        displayForTeamB(runsTeamB);
    }


    // displays out count for Team A
    public void displayOutCountTeamA(int outs) {
        TextView count = findViewById(R.id.out_count_teamA);
        count.setText(String.valueOf(outs));
    }

    // displays out count for Team B
    public void displayOutCountTeamB(int outs) {
        TextView count = findViewById(R.id.out_count_teamB);
        count.setText(String.valueOf(outs));
    }

    // displays overs for Team A
    public void displayOversTeamA(int overs) {
        TextView count_over = findViewById(R.id.over_count_teamA);
        count_over.setText(String.valueOf(overs));
    }

    // displays overs for Team B
    public void displayOversTeamB(int overs) {
        TextView count_over = findViewById(R.id.over_count_teamB);
        count_over.setText(String.valueOf(overs));
    }

    public void OutCountTeamA(View view) {
        outCountTeamA = outCountTeamA + 1;
        displayOutCountTeamA(outCountTeamA);
    }

    public void OverCountTeamA(View view) {
        overCountTeamA = overCountTeamA + 1;
        displayOversTeamA(overCountTeamA);
    }

    public void OutCountTeamB(View view) {
        outCountTeamB = outCountTeamB + 1;
        displayOutCountTeamB(outCountTeamB);
    }

    public void OverCountTeamB(View view) {
        overCountTeamB = overCountTeamB + 1;
        displayOversTeamB(overCountTeamB);
    }

    public void Reset(View view) {

        runsTeamA = 0;
        runsTeamB = 0;
        outCountTeamA = 0;
        outCountTeamB = 0;
        overCountTeamA = 0;
        overCountTeamB = 0;

        displayForTeamA(runsTeamA);
        displayForTeamB(runsTeamB);
        displayOutCountTeamA(outCountTeamA);
        displayOutCountTeamB(outCountTeamB);
        displayOversTeamA(overCountTeamA);
        displayOversTeamB(overCountTeamB);
    }

}
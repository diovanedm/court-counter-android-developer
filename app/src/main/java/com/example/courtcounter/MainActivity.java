package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsTeamA = 0;
    int pointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonThreePointsTeamA = findViewById(R.id.three_points_team_A_button);
        buttonThreePointsTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(3, "a");
            }
        });

        Button buttonTwoPointsTeamA = findViewById(R.id.two_points_team_A_button);
        buttonTwoPointsTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(2, "a");
            }
        });

        Button buttonOnePointTeamA = findViewById(R.id.free_throw_team_A_button);
        buttonOnePointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(1, "a");
            }
        });

        Button buttonThreePointsTeamB = findViewById(R.id.three_points_team_B_button);
        buttonThreePointsTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(3, "b");
            }
        });

        Button buttonTwoPointsTeamB = findViewById(R.id.two_points_team_B_button);
        buttonTwoPointsTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(2, "b");
            }
        });

        Button buttonOnePointTeamB = findViewById(R.id.free_throw_team_B_button);
        buttonOnePointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementPoints(1, "b");
            }
        });

        Button resetPointsButton = findViewById(R.id.reset_button);
        resetPointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPoints();
            }
        });
    }

    public void incrementPoints(int point, String team) {
        if(team == "a") {
            pointsTeamA = pointsTeamA + point;
            displayTeamA();
        } else {
            pointsTeamB = pointsTeamB + point;
            displayTeamB();
        }
    }

    public void displayTeamA() {
        TextView placarTeamA = findViewById(R.id.placar_team_A_text_view);
        placarTeamA.setText("" + pointsTeamA);
    }

    public void displayTeamB() {
        TextView placarTeamB = findViewById(R.id.placar_team_B_text_view);
        placarTeamB.setText("" + pointsTeamB);
    }

    public void resetPoints() {
        pointsTeamA = 0;
        pointsTeamB = 0;
        displayTeamA();
        displayTeamB();
    }
}
package com.example.android.lifegoal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        TextView mgoalText=(TextView)findViewById(R.id.goallist);
        String goals[]=Goals.goalNames();
        for (String goalName: goals){
mgoalText.append(goalName+ "\n\n\n");
        }
    }
}

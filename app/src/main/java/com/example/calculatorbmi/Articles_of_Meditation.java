package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articles_of_Meditation extends AppCompatActivity {


private Button benefitsofmeditation;
private Button typeofmeditation;
private Button shouldmeditation;
private Button wanttostart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_of__meditation);

    benefitsofmeditation = findViewById(R.id.benefitsofmeditation);

    typeofmeditation = findViewById(R.id.typeofmeditation);

    shouldmeditation = findViewById(R.id.shouldmeditation);

    wanttostart = findViewById(R.id.wanttostart);

    benefitsofmeditation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            benefitsofmeditation = findViewById(R.id.benefitsofmeditation);

            Button benefitsofmeditation = (Button) findViewById(R.id.benefitsofmeditation);

            benefitsofmeditation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Articles_of_Meditation.this,Benefits_Of_Medidation.class));
                }
            });

            typeofmeditation = findViewById(R.id.typeofmeditation);

            Button typeofmeditation = (Button) findViewById(R.id.typeofmeditation);

            typeofmeditation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Articles_of_Meditation.this,Types_of_Medidation.class));
                }
            });

            shouldmeditation = findViewById(R.id.shouldmeditation);

            Button shouldmeditation = (Button) findViewById(R.id.shouldmeditation);

            shouldmeditation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Articles_of_Meditation.this,Why_Should_Meditation.class));
                }
            });

            wanttostart = findViewById(R.id.wanttostart);

            Button wanttostart = (Button) findViewById(R.id.wanttostart);

            wanttostart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Articles_of_Meditation.this,Want_To_Start_Med.class));
                }
            });


        }
    });




    }
}
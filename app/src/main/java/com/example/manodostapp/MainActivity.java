package com.example.manodostapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.patid);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientSignUp();
            }
        });

        btn2 = findViewById(R.id.otherid);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCaregiverSignUp();
            }
        });

    }

    public void openPatientSignUp(){
        Intent intent = new Intent(this, PatientSignUp.class);
        startActivity(intent);
    }

    public void openCaregiverSignUp(){
        Intent intent = new Intent(this, CaregiverSignUp.class);
        startActivity(intent);
    }

}
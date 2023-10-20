package com.example.manodostapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientSignUp extends AppCompatActivity {
    private Button signupbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_sign_up);

        signupbtn1 = findViewById(R.id.signup_button);
//        signupbtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openPatientSignIn();
//            }
//        });
    }

//    public void openPatientSignIn(){
//        Intent intent = new Intent(this, PatientSignIn.class);
//        startActivity(intent);
//    }
}


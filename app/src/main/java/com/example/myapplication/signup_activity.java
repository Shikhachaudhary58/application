package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup_activity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        b1=findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button= new Intent(signup_activity.this, page.class);
                startActivity(button);
                Toast.makeText(signup_activity.this, "Successfully registered", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
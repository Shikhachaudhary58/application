package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button Login;
    Button Register;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        Login = findViewById(R.id.login);
        Register = findViewById(R.id.register);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Login has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity2.this, sign_in.class);
                startActivity(intent);
            }


        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Register has been clicked", Toast.LENGTH_LONG).show();

                Intent intent1 = new Intent(MainActivity2.this,signup_activity.class);
                startActivity(intent1);
            }
        });


    }
}
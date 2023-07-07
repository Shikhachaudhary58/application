package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        TextView text= findViewById(R.id.txt);
        String str="New User? Create New";
        SpannableString s = new SpannableString(str);

        ClickableSpan clickable1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(sign_in.this, "New User", Toast.LENGTH_SHORT).show();
            }
        };
        s.setSpan(clickable1, 10, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text.setText(s);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        text1= findViewById(R.id.txt);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sign_in.this, signup_activity.class);
                startActivity(i);
            }
        });

    }
}
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

public class page extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        TextView text = findViewById(R.id.t);
        String str = "Login page";
        SpannableString s = new SpannableString(str);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(page.this, "Login Page", Toast.LENGTH_SHORT).show();
            }
        };


        s.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text.setText(s);
        text.setMovementMethod(LinkMovementMethod.getInstance());


        t1.findViewById(R.id.t);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(page.this, sign_in.class);
                startActivity(i1);

            }
        });
    }
}
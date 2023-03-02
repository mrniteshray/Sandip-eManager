package com.example.sandipe_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button studentbtn,manabtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        studentbtn = findViewById(R.id.studentbtn);
        manabtn = findViewById(R.id.manabtn);

        //for going to student login
        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,student_login.class);
                startActivity(intent);
            }
        });

        //for going to management login
        manabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,management_login.class);
                startActivity(intent);
            }
        });

    }
}
package com.example.basicquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {


    TextView ques1;
    TextView ques2;
    TextView ques3;
    Button true1;
    Button true2;
    Button true3;
    Button false1;
    Button false2;
    Button false3;
    Button resetBtn;

    String ans1;
    String ans2;
    String ans3;

    boolean isClicked1;
    boolean isClicked2;
    boolean isClicked3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ques1 = findViewById(R.id.ques1Txt);
        ques2 = findViewById(R.id.ques2Txt);
        ques3 = findViewById(R.id.ques3Txt);
        true1 = findViewById(R.id.ques1T);
        true2 = findViewById(R.id.ques2T);
        true3 = findViewById(R.id.ques3T);
        false1 = findViewById(R.id.ques1F);
        false2 = findViewById(R.id.ques2F);
        false3 = findViewById(R.id.ques3F);
        resetBtn = findViewById(R.id.resetBtn);

        Intent intent = getIntent();
        ques1.setText(intent.getStringExtra("ques1"));
        ques2.setText(intent.getStringExtra("ques2"));
        ques3.setText(intent.getStringExtra("ques3"));
        ans1 = intent.getStringExtra("ans1");
        ans2 = intent.getStringExtra("ans2");
        ans3 = intent.getStringExtra("ans3");

        // Question 1

        true1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked1){
                    if(ans1.equals("TRUE")) ques1.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques1.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked1 = true;
            }
        });
        false1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked1){
                    if(ans1.equals("FALSE")) ques1.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques1.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked1 = true;
            }
        });

        // Question 2

        true2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked2){
                    if(ans2.equals("TRUE")) ques2.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques2.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked2 = true;
            }
        });
        false2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked2){
                    if(ans2.equals("FALSE")) ques2.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques2.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked2 = true;
            }
        });

        // Question 3
        true3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked3){
                    if(ans3.equals("TRUE")) ques3.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques3.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked3 = true;
            }
        });
        false3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isClicked3){
                    if(ans3.equals("FALSE")) ques3.setBackgroundColor(Color.parseColor("#00FF00"));
                    else ques3.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                isClicked3 = true;
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked1 = false;
                isClicked2 = false;
                isClicked3 = false;
                ques1.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                ques2.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                ques3.setBackgroundColor(Color.parseColor("#00FFFFFF"));
            }
        });

    }
}
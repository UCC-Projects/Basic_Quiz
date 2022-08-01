package com.example.basicquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button qtn1;
    Button qtn2;
    Button qtn3;
    Button nextBtn;
    String ques1;
    String ques2;
    String ques3;
    String ans1;
    String ans2;
    String ans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qtn1 = findViewById(R.id.question1Btn);
        qtn2 = findViewById(R.id.question2Btn);
        qtn3 = findViewById(R.id.question3Btn);
        nextBtn = findViewById(R.id.next);

        qtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(1);
            }
        });

        qtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(2);
            }
        });

        qtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(3);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuizActivity();
            }
        });

    }

    private void openQuizActivity() {
        Intent intent = new Intent(MainActivity.this,QuizActivity.class);
        intent.putExtra("ques1",ques1);
        intent.putExtra("ques2",ques2);
        intent.putExtra("ques3",ques3);
        intent.putExtra("ans1",ans1);
        intent.putExtra("ans2",ans2);
        intent.putExtra("ans3",ans3);
        startActivity(intent);
    }

    private void openDialog(int questionNo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.questions,null);
        builder.setView(view);

        AlertDialog dialog = builder.create();
        //
        EditText setQuestion = view.findViewById(R.id.questionSetEdt);
        EditText setAnswer = view.findViewById(R.id.answerSetEdt);
        Button doneBtn = view.findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (questionNo){
                    case 1:
                        ques1 = setQuestion.getText().toString();
                        ans1 = setAnswer.getText().toString().toUpperCase().trim();
                        break;
                    case 2:
                        ques2 = setQuestion.getText().toString();
                        ans2 = setAnswer.getText().toString().toUpperCase().trim();
                        break;
                    case 3:
                        ques3 = setQuestion.getText().toString();
                        ans3 = setAnswer.getText().toString().toUpperCase().trim();
                        break;
                    default:
                        break;
                }
                dialog.dismiss();
            }
        });

        //

        dialog.show();
    }
}
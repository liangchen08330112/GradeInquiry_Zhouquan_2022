package com.example.gradeinquiry.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gradeinquiry.R;

public class GradesKnowing extends AppCompatActivity {

    private Button button_showGrades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_knowing);
        initView();

    }

    private void initView() {
        button_showGrades = (Button) findViewById(R.id.button_showGrades);
        button_showGrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
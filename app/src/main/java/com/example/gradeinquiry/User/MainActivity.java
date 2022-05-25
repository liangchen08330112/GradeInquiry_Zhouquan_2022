package com.example.gradeinquiry.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.gradeinquiry.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButton;
    private TextView textView_inquiry, textView_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        textView_inquiry = (TextView) findViewById(R.id.textView_inquiry);
        textView_quit = (TextView) findViewById(R.id.textView_quit);

        imageButton.setOnClickListener(this);
        textView_inquiry.setOnClickListener(this);
        textView_quit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton:

                break;
            case R.id.textView_inquiry:

                break;
            case R.id.textView_quit:

                break;
            default:
                break;
        }
    }
}
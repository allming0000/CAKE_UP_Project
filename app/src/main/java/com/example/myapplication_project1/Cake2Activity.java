package com.example.myapplication_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class Cake2Activity extends AppCompatActivity{

    View Page1, Page2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake2);

        Page1 = findViewById(R.id.potatoPage);
        Page2 = findViewById(R.id.chocoPage);


       findViewById(R.id.potato).setOnClickListener(mClickListener);
       findViewById(R.id.choco).setOnClickListener(mClickListener);


    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Page1.setVisibility(View.INVISIBLE);
            Page2.setVisibility(View.INVISIBLE);

            switch (v.getId()){
                case R.id.potato:
                    Page1.setVisibility(View.VISIBLE);
                    break;
                case R.id.choco:
                    Page2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };



}


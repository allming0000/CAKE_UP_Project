package com.example.myapplication_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ServiceHomeActivity extends AppCompatActivity {


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_home);

        btn1 = findViewById(R.id.twosome);
        btn2 = findViewById(R.id.paris);
        btn3 = findViewById(R.id.tous);
        btn4 = findViewById(R.id.star);
        btn5 = findViewById(R.id.hotel_home1);
        btn6 = findViewById(R.id.hotel_home2);
        btn7 = findViewById(R.id.hotel_home3);
        btn8 = findViewById(R.id.hotel_home4);
        btn9 = findViewById(R.id.hotel_home5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twosome.co.kr/main.do"));
                startActivity(intent1);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paris.co.kr/"));
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tlj.co.kr:7008/index.asp"));
                startActivity(intent3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://brand.naver.com/starbucks"));
                startActivity(intent4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hilton.co.kr/hotel/seoul/millennium-hilton-seoul?gclid=CI-W2_qy2fQCFZBEvAodqMUDGA&gclsrc=ds"));
                startActivity(intent5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.josunhotel.com/hotel/westinSeoul.do"));
                startActivity(intent6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.p-city.com/front"));
                startActivity(intent7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fourseasons.com/kr/seoul/"));
                startActivity(intent8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marriott.co.kr/default.mi?dclid=CJbB1puz2fQCFUYXvQodhEoALQ"));
                startActivity(intent9);
            }
        });






    }
}






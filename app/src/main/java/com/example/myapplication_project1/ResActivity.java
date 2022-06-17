package com.example.myapplication_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;


import java.util.Calendar;
import java.util.Date;

public class ResActivity extends AppCompatActivity {


    Button prevbtn, nextbtn;
    DatePicker dp;
    TimePicker tp;
    GridLayout glayout, glayout2;
    TextView date, time, cake, brand, timertv, caketv, brandtv;
    Spinner spinner1, spinner2;
    Switch startswitch;
    int page = 0;
    int tt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        setTitle("케이크 예약");

        prevbtn = (Button) findViewById(R.id.prevb);
        nextbtn = (Button) findViewById(R.id.nextb);

        dp = (DatePicker) findViewById(R.id.datePicker);
        tp = (TimePicker) findViewById(R.id.timePicker);

        glayout = (GridLayout) findViewById(R.id.gridlayout1);
        glayout2 = (GridLayout) findViewById(R.id.gridlayout2);

        date = (TextView) findViewById(R.id.datetv);
        time = (TextView) findViewById(R.id.timetv);
        brand = (TextView) findViewById(R.id.res_brand);
        cake = (TextView) findViewById(R.id.res_cake);
        timertv = (TextView) findViewById(R.id.timer);
        caketv = (TextView) findViewById(R.id.caketv);
        brandtv = (TextView)findViewById(R.id.brandtv);

        spinner1 = (Spinner) findViewById(R.id.spinner_brand);
        spinner2 = (Spinner) findViewById(R.id.spinner_cake);

        final String[] spinner_brand = {"투썸플레이스", "스타벅스", "파리바게트", "뚜레쥬르", "베스킨라빈스", "밀레니엄힐튼서울"
        ,"웨스트 조선", "파라다이스 시티 인천", "포시즌스 서울", "jw메리어트 동대문"};

        ArrayAdapter<String> adapter1;
        adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, spinner_brand);
        spinner1.setAdapter(adapter1);


        final String[] spinner_cake = {"고구마 밀크 생크림", "딸기 생크림", "미라클 윈터 파티", "윈터 보니밤 케이크", "미라클 초콜릿 무스",
        "화이트 포레스트 생크림", "트리플 베리 생크림", "마이 투썸 하트", "스트로베리 초콜릿 생크림", "마스카포네 생크림", "딸기 듬뿍 마스카포네 케이크",
        "산타 벨벳 체커스 케이크", "부드러운 고구마 생크림 케이크", "크런치 가나 레이어 케이크", "슈크림 트리 바움쿠헨","티라미수 부쉬 드 노엘",
        "메리크리스마스 치즈", "블레싱 레드베리 스페셜", "위싱 트리","산타 이즈 벡", "산타는 딸기 루돌프는 초코", "호호호 루돌프", "호호호 산타",
        "징글벨 징글벨", "크리스마스 레드벨벳", "화이트 크리스마스 티라미수", "해피해피 스노우맨", "백설공주와 달콤한 사과", "파티 싼타 케이크","힙스터 루돌프 케이크",
        "쿠키런 통나무 롤케이크", "엘사 올라프 초코 스트로베리 케이크", "뽀로로의 크리스마스 파티 케이크", "흰 눈 사이로 설렘을 타고", "빨간코 루돌프",
        "파티 위드 트윙클 트리", "선물을 전하는 산타 썰매", "화이트 쉬폰 트리 케이크", "발로나 다크 초콜릿 돔 무스 케이크",
        "Happy Pine Tree Cake", "White Snow Cake", "딸기 트리", "진저 하우스", "흑임자 바닐라 케이크",
        "둘세 초콜릿 몽블랑"};

        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, spinner_cake);
        spinner2.setAdapter(adapter2);



        startswitch = (Switch) findViewById(R.id.switch1);

        mHandler.sendEmptyMessage(1);

        startswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (startswitch.isChecked())
                {
                    tt = 0;
                    page = 0;
                    prevbtn.setVisibility(View.VISIBLE);
                    nextbtn.setVisibility(View.VISIBLE);
                    dp.setVisibility(View.VISIBLE);
                    tp.setVisibility(View.INVISIBLE);
                    glayout.setVisibility(View.INVISIBLE);
                    glayout2.setVisibility(View.INVISIBLE);
                    timertv.setVisibility(View.VISIBLE);
                    prevbtn.setEnabled(false);
                    nextbtn.setEnabled(true);
                }
                else {
                    tt = 0;
                    timertv.setVisibility(View.INVISIBLE);
                    page = 0;
                    resetcalander();
                    date.setText("년 월 일");
                    time.setText("시 분");
                    brand.setText("브랜드");
                    cake.setText("케이크");
                    prevbtn.setVisibility(View.VISIBLE);
                    nextbtn.setVisibility(View.INVISIBLE);
                    glayout.setVisibility(View.INVISIBLE);
                    glayout2.setVisibility(View.INVISIBLE);
                    dp.setVisibility(View.INVISIBLE);
                    tp.setVisibility(View.INVISIBLE);
                }
            }
        });
        dp.init(dp.getYear(), dp.getMonth(), dp.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.setText(year + "년" + (monthOfYear + 1) + "월" + dayOfMonth + "일");
            }
        });
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                time.setText(hourOfDay + "시 " + minute + "분 ");
            }
        });
    }

        Handler mHandler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                int div = msg.what;
                int min = tt / 60;
                int sec = tt % 60;
                String strTime = String.format("%02d : %02d", min, sec);

                this.sendEmptyMessageDelayed(0, 1000);
                timertv.setText(strTime);
                timertv.invalidate();
                tt++;
            }
        };

        public void resetcalander() {
            Calendar cal;
            cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            dp.updateDate(year, month, day);
            tp.setCurrentHour(hour);
            tp.setCurrentMinute(min);
        }

        public void mengbutton(View v) {
            switch (v.getId()) {
                case R.id.prevb:
                    if(page > 0) {
                        page--;
                    }
                    changepage();
                    break;
                case R.id.nextb:
                    if(page < 4) {
                        page++;
                    }
                    changepage();
                    break;
                default:
                    break;

        }
        }

        public void changepage() {
            if(page == 0) {
                dp.setVisibility(View.VISIBLE);
                tp.setVisibility(View.INVISIBLE);
                glayout.setVisibility(View.INVISIBLE);
                glayout2.setVisibility(View.INVISIBLE);

                prevbtn.setEnabled(false);
                nextbtn.setEnabled(true);
            }
            if(page == 1) {
                dp.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.VISIBLE);
                glayout.setVisibility(View.INVISIBLE);
                glayout2.setVisibility(View.INVISIBLE);

                prevbtn.setEnabled(true);
                nextbtn.setEnabled(true);
            }
            if(page == 2) {
                dp.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.INVISIBLE);
                glayout.setVisibility(View.VISIBLE);
                glayout2.setVisibility(View.INVISIBLE);

                prevbtn.setEnabled(true);
                nextbtn.setEnabled(true);

            }
            if(page == 3) {
                dp.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.INVISIBLE);
                glayout.setVisibility(View.INVISIBLE);
                glayout2.setVisibility(View.VISIBLE);
                brandtv.setText(spinner1.getSelectedItem().toString());
                caketv.setText((spinner2.getSelectedItem().toString()));
                prevbtn.setEnabled(true);
                nextbtn.setEnabled(false);


        }


}}


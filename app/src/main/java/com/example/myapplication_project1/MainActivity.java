package com.example.myapplication_project1;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    int dateEndY, dateEndM, dateEndD;
    int ddayValue = 0;

    //현재 날짜를 알기 위해서
    Calendar calendar;
    int currentYear, currentMonth, currentDay;

    // millisecond 형태의 하루 24시
    private final int ONE_DAY = 24*60*60*1000;

    TextView edit_endDateBtn, edit_result;
    Button datePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calendar = Calendar.getInstance();
        currentYear = calendar.get(Calendar.YEAR);
        currentMonth = calendar.get(Calendar.MONTH);
        currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        datePicker = (Button) findViewById(R.id.date);
        edit_endDateBtn = (TextView) findViewById(R.id.edt_dday);
        edit_result = (TextView) findViewById(R.id.edt_result);

        Locale.setDefault(Locale.KOREA);

        edit_endDateBtn.setText(currentYear + "년" + (currentMonth + 1) + "월" + currentDay + "일");

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, endDateSetListener, (currentYear), (currentMonth), (currentDay)).show();
            }
        });



        Button cake_button = (Button) findViewById(R.id.cakeButton);
        cake_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CakeActivity.class);
                startActivity(intent);
            }
        });

        Button map_button = (Button) findViewById(R.id.mapButton);
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        Button res_button = (Button) findViewById(R.id.resButton);
        res_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResActivity.class);
                startActivity(intent);
            }
        });

        Button service_button = (Button) findViewById(R.id.serviceButton);
        service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(intent);
            }
        });

    }

    private DatePickerDialog.OnDateSetListener endDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            edit_endDateBtn.setText(year + "년" + (month + 1) + "월" + dayOfMonth + "일");

            ddayValue = ddayResult_int(dateEndY, dateEndM, dateEndD);
            edit_result.setText(getDday(year, month, dayOfMonth));
        }
    };


    private String getDday(int mYear, int mMonthOfYear, int mDayOfMonth) {

        final Calendar ddayCalendar = Calendar.getInstance();
        ddayCalendar.set(mYear, mMonthOfYear, mDayOfMonth);

        final long dday = ddayCalendar.getTimeInMillis() / ONE_DAY;
        final long today = Calendar.getInstance().getTimeInMillis() / ONE_DAY;
        long result = dday - today;


        String strFormat;

        if(result > 0) {
            strFormat = "D-%d";
        } else if(result == 0) {
            strFormat = "Today";
        }else {

            strFormat = "D+%d";
        }

        final String strCount = (String.format(strFormat,result));
        return strCount;
    }

    public int onCalculatorDate(int dateEndY, int dateEndM, int dateEndD) {
        try {
            Calendar today = Calendar.getInstance();
            Calendar dday = Calendar.getInstance();

            Calendar calendar = Calendar.getInstance();
            int cyear = calendar.get(Calendar.YEAR);
            int cmonth = calendar.get((Calendar.MONTH) + 1);
            int cday = calendar.get(Calendar.DAY_OF_MONTH);

            today.set(cyear, cmonth, cday);
            dday.set(dateEndY, dateEndM, dateEndD);

            long day = dday.getTimeInMillis() / 86400000;
            long tday = today.getTimeInMillis() / 86400000;
            long count = tday - day;
            return (int) count;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int ddayResult_int(int dateEndY, int dateEndM, int dateEndD) {
        int result = 0;
        result = onCalculatorDate(dateEndY, dateEndM, dateEndD);
        return result;
    }


}

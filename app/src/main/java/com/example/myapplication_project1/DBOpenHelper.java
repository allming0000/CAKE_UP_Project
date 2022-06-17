package com.example.myapplication_project1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBOpenHelper extends SQLiteOpenHelper {


    static final String DB_NAME = "Favorite.db";
    public  static final String DB_Table_Favorite = "Favorite";
    static final int DB_version = 2;

    public DBOpenHelper (Context context) {
        // 생성자를 이용하여 클래스 사용 시 기본적으로 화면의 제어권자를 입력 받는다.
        super(context, DB_NAME, null, DB_version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + DB_Table_Favorite + "(" +
                "number INTEGER PRIMARY KEY AUTOINCREMENT," +
                "code TEXT," +
                "name TEXT," +
                "img TEXT," +
                "price INTEGER," +
                "id TEXT," +
                "count INTEGER)");

        Log.d("Favorite Table", "찜 목록 테이블 생성");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

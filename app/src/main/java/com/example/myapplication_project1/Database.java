package com.example.myapplication_project1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Database {


    SQLiteDatabase mDB = null;
    DBOpenHelper mDBopenHelper = null;
    Cursor c;
    String sql;

    private static Database singletonDB;

    private Database() {

    }

    public static Database getInstance() {
        if(singletonDB == null) {
            singletonDB = new Database();
        }
        return singletonDB;
    }

    // 찜 목록 메뉴 추가
    public void FavoriteList(SQLiteDatabase db, String code, String name, int img, int price, String id, int count) {
        sql = "SELECT img, name, price FROM" + mDBopenHelper.DB_Table_Favorite + " WHERE code = " + "'" + code + "'";
        db.execSQL(sql);


    }

}

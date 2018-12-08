package com.hf.mysquad;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseTestHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "DB_NAME";
    private static final int DB_VERSION = 1;

     public DatabaseTestHelper(Context context){
        super(context,null,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE SORT_TABLE " +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT,_blob TEXT);");

        ContentValues test = new ContentValues();
        test.put("_blob","FIX ME");

        db.insert("SORT_TABLE",null,test);

     }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

package com.example.kannan.mysqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.R.attr.name;

/**
 * Created by kannan on 12/4/2016.
 */

public class UserDbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "UserRegistration.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY =
            "Create Table "+UserContract.NewUserInfo.TABLE_NAME+"("+UserContract.NewUserInfo.USER_NAME+" Text,"+UserContract.NewUserInfo.USER_PASS+" Text,"+UserContract.NewUserInfo.USER_EMAIL+" Text,"+UserContract.NewUserInfo.USER_MOB+" Text,"+UserContract.NewUserInfo.USER_CITY+" Text);";

    public UserDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("Database Operation","Database Created....");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_QUERY);
        Log.e("Database Operation","Table is Created...");

    }

    public void addInfo(String uname, String password, String emailid, String mob, String citie,SQLiteDatabase sqLiteDatabase) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(UserContract.NewUserInfo.USER_NAME,name);
        contentValues.put(UserContract.NewUserInfo.USER_PASS,password);
        contentValues.put(UserContract.NewUserInfo.USER_EMAIL,emailid);
        contentValues.put(UserContract.NewUserInfo.USER_MOB,mob);
        contentValues.put(UserContract.NewUserInfo.USER_CITY,citie);
        sqLiteDatabase.insert(UserContract.NewUserInfo.TABLE_NAME,null,contentValues);

        Log.e("Database Operations","One Row Inserted...");
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}

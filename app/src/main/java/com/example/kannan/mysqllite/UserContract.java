package com.example.kannan.mysqllite;

/**
 * Created by kannan on 12/4/2016.
 */

public class UserContract  {


    public static abstract class NewUserInfo
    {
        public static final String TABLE_NAME = "userregister";
        public static final String USER_NAME = "username";
        public static final String USER_PASS = "userpass";
        public static final String USER_EMAIL = "useremail";
        public static final String USER_MOB = "usermob";
        public static final String USER_CITY = "usercity";

    }
}

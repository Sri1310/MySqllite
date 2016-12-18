package com.example.kannan.mysqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username,pass,email,phone,city;
    Context context = this;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        username = (EditText)findViewById(R.id.editText1);
        pass = (EditText)findViewById(R.id.editText2);
        email = (EditText)findViewById(R.id.editText3);
        phone = (EditText)findViewById(R.id.editText4);
        city = (EditText)findViewById(R.id.editText5);
        submit = (Button)findViewById(R.id.button1);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uname = username.getText().toString();
                String password = pass.getText().toString();
                String emailid = email.getText().toString();
                String mob = phone.getText().toString();
                String citie = city.getText().toString();

                userDbHelper = new UserDbHelper(context);
                sqLiteDatabase = userDbHelper.getWritableDatabase();
                userDbHelper.addInfo(uname,password,emailid,mob,citie,sqLiteDatabase);

                Toast.makeText(getBaseContext(),"Register Sucessfully",Toast.LENGTH_LONG).show();

                userDbHelper.close();
            }
        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

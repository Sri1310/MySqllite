package com.example.kannan.mysqllite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button ins,show,find,updat,dlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        ins = (Button)findViewById(R.id.insert_data);
        show = (Button)findViewById(R.id.view_data);
        find = (Button)findViewById(R.id.search_data);
        updat = (Button)findViewById(R.id.update_data);
        dlt = (Button)findViewById(R.id.delete_data);


        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(i);
            }
        });



    }

}

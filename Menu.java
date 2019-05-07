package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    ImageView image_Info;
        ImageView image_setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        image_Info= findViewById(R.id.imageinfo);
        image_setting=findViewById(R.id.imgesetting);

        image_Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= getIntent();
                String user_email1= intent.getStringExtra("email");
                Intent intent11= new Intent(Menu.this,UserDetails.class);
                intent11.putExtra("useremail1",user_email1);
                startActivity(intent11);
                finish();
            }
        });
        image_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent101 = new Intent(Menu.this, Setting.class);
                startActivity(intent101);

            }
        });

    }
}

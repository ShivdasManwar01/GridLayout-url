package com.example.gridlayout_url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button google,yahoo,youtube,geeksforgeeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.google.com");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.youtube.com");
            }
        });
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.yahoo.com");
            }
        });
        geeksforgeeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.geeksforgeeks.com");
            }
        });

    }
    public void init(){
        google=findViewById(R.id.google);
        yahoo=findViewById(R.id.yahoo);
        geeksforgeeks=findViewById(R.id.geeksforgeeks);
        youtube=findViewById(R.id.youtube);
    }
    public void openUrl(String str){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(str));
        startActivity(intent);
    }
}
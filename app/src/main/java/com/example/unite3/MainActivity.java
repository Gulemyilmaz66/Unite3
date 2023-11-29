package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Uyg1(View view) {
        Intent i=new Intent( MainActivity.this,Uyg1.class);
       startActivity (i);
    }

    public  void Uyg2(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }
    public  void Uyg3(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }

    public void Uyg4(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }
    public  void uyg5(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public  void Uyg6(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6.class);
        startActivity(i);
    }

    public  void uyg7(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7.class);
        startActivity(i);
    }



}
package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;

public class Uyg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg4);



        char karakter = 'a';
        int ascii = (int) karakter;
        System.out.println("Karakter:" + karakter);
        System.out.println("ASCII kodu:"+ ascii);


        if (ascii<= 48 && ascii>= 58)

            System.out.println("yazı girildi");

       else

            System.out.println("rakam girildi");

    }
    public void Geri(View view) {
        Intent i =new Intent(Uyg4.this,MainActivity.class);
        startActivity(i);
    }

}
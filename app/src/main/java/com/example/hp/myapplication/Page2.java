    package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

    public class Page2 extends AppCompatActivity  {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_page2);


            Button button4 = findViewById(R.id.button4);
            Button button12 = findViewById(R.id.button12);
            Button button13 = findViewById(R.id.button13);
            Button button17 = findViewById(R.id.button17);
            Button button18 = findViewById(R.id.button18);
            Button button19 = findViewById(R.id.button19);
            Button button20 = findViewById(R.id.button20);
            Button button21 = findViewById(R.id.button21);
            Button button22 = findViewById(R.id.button22);
            Button button23 = findViewById(R.id.button23);
            Button button25 = findViewById(R.id.button25);
            Button button26 = findViewById(R.id.button26);
            Button button27 = findViewById(R.id.button27);
            Button button28 = findViewById(R.id.button28);
            Button button29 = findViewById(R.id.button29);


            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Page2.this, page3.class);
                    startActivity(intent);
                }
            });

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Page2.this, page4.class);
                    startActivity(intent1);
                }
            });


            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent3 = new Intent(Page2.this, page5.class);
                    startActivity(intent3);
                }
            });

            button17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent4 = new Intent(Page2.this, page6.class);
                    startActivity(intent4);
                }
            });

            button18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent5 = new Intent(Page2.this, page7.class);
                    startActivity(intent5);
                }
            });

            button19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent6 = new Intent(Page2.this, page8.class);
                    startActivity(intent6);
                }
            });

            button20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent7 = new Intent(Page2.this, page9.class);
                    startActivity(intent7);
                }
            });

            button21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent8 = new Intent(Page2.this, page10.class);
                    startActivity(intent8);
                }
            });

            button22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent9 = new Intent(Page2.this, page11.class);
                    startActivity(intent9);
                }
            });

            button23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent10 = new Intent(Page2.this, page12.class);
                    startActivity(intent10);
                }
            });

            button25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent11 = new Intent(Page2.this, page13.class);
                    startActivity(intent11);
                }
            });

            button26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent12 = new Intent(Page2.this, page14.class);
                    startActivity(intent12);
                }
            });


            button27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent13 = new Intent(Page2.this, page15.class);
                    startActivity(intent13);
                }
            });

            button28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent14 = new Intent(Page2.this, page16.class);
                    startActivity(intent14);
                }
            });

            button29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent15 = new Intent(Page2.this, page17.class);
                    startActivity(intent15);
                }
            });
//
//                }
        }
    }
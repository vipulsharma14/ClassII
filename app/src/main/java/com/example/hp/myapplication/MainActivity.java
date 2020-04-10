    package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity extends AppCompatActivity {
        public Button button;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), Page2.class);
                    System.out.print("Testing onclicks");
                    startActivity(intent);
                }

//                private void startActivity(Intent intent) {
//                    System.out.print("Testing  onclicks");
//
//                }
            });
        }
    }
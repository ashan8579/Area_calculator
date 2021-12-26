package com.example.genericareacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button square=findViewById(R.id.square);
        Button rec=findViewById(R.id.rec);
        Button tri=findViewById(R.id.triangle);
        Button cir=findViewById(R.id.circle);
        square.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), box.class));
            }
        });
        rec.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), rectangle.class));
            }
        });
//        tri.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                startActivity(new Intent(getApplicationContext(), triangle.class));
//            }
//        });
//        cir.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                startActivity(new Intent(getApplicationContext(), circle.class));
//
//            }
//        });
    }

}
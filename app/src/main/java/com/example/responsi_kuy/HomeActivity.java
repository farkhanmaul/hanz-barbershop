package com.example.responsi_kuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardView = findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BookingActivity = new Intent(HomeActivity.this,BookingActivity.class);
                startActivity(BookingActivity);
            }
        });

        CardView cardView2 = findViewById(R.id.card_view2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BookingActivity = new Intent(HomeActivity.this,BookingActivity.class);
                startActivity(BookingActivity);
            }
        });

        CardView cardView3 = findViewById(R.id.card_view3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BookingActivity = new Intent(HomeActivity.this,BookingActivity.class);
                startActivity(BookingActivity);
            }
        });

        CardView cardView4 = findViewById(R.id.card_view4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BookingActivity = new Intent(HomeActivity.this,BookingActivity.class);
                startActivity(BookingActivity);
            }
        });
    }
}
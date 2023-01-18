package com.example.responsi_kuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class BillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        final Random myRandom = new Random();
        final TextView textGenerateNumber = (TextView)findViewById(R.id.textViewliat1);
        textGenerateNumber.setText(String.valueOf(myRandom.nextInt(99)));



        Button Submit = findViewById(R.id.button_close);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeActivity = new Intent(BillActivity.this,HomeActivity.class);
                startActivity(HomeActivity);
            }
        });
    }
}
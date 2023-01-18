package com.example.responsi_kuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        final Spinner List = findViewById(R.id.listItem);


        Button Submit = findViewById(R.id.btn_book);
        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Berhasil memesan antrian dengan Barberman "+List.getSelectedItem(), Toast.LENGTH_SHORT).show();
                Intent BillActivity = new Intent(BookingActivity.this,BillActivity.class);
                startActivity(BillActivity);
            }
        });
    }
}

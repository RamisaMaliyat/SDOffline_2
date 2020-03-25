package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    TextView nameTextView ,costTextView           ,        TripTextveiw;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        nameTextView = (TextView) findViewById(R.id.Name);
        costTextView = (TextView) findViewById(R.id.cost);







        TripTextveiw = (TextView) findViewById(R.id.Trip);










        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String name = bundle.getString("Name");

            String cost = bundle.getString("cost");








            String Trip = bundle.getString("Trip");









            nameTextView.setText(name);
            costTextView.setText(cost);









            TripTextveiw.setText(Trip);




        }



        }





        }






package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TripActivity extends AppCompatActivity implements View.OnClickListener{

    Button goToMemberActivityButton;

    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);

        goToMemberActivityButton = (Button) findViewById(R.id.button);

        editText = (EditText) findViewById(R.id.Trip);

        goToMemberActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        String TripStr = editText.getText().toString();




        Intent loginIntent = new Intent(TripActivity.this, MemberDetailsActivity.class);


        loginIntent.putExtra("Trip",TripStr);





        startActivity(loginIntent);














    }
}

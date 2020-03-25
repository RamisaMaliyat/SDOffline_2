package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MemberDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    Button ActivityButton;

    EditText editText,CostText;




    TextView TripTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);
        ActivityButton = (Button) findViewById(R.id.ok);

        editText = (EditText) findViewById(R.id.Name);
        CostText = (EditText) findViewById(R.id.cost);



        ActivityButton.setOnClickListener(this);



        TripTextView = (TextView) findViewById(R.id.Trip);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String Trip = bundle.getString("Trip");

            TripTextView.setText(Trip);

        }



    }

    @Override
    public void onClick(View v) {




        String tripnameStr = TripTextView.getText().toString();



        String NameStr = editText.getText().toString();

        String CostStr = CostText.getText().toString();

        Intent loginIntent = new Intent(MemberDetailsActivity.this, DetailsActivity.class);

        loginIntent.putExtra("Name",NameStr);

        loginIntent.putExtra("cost",CostStr);




        loginIntent.putExtra("Trip", tripnameStr);



        startActivity(loginIntent);



    }
}

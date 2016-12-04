package com.example.sam.investmentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetActivity extends Activity {
    EditText grossEdit, rentEdit, utilityEdit, transportEdit;
    Double gross, rent, utility, transport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        grossEdit = (EditText)findViewById(R.id.grossincome);
        rentEdit = (EditText)findViewById(R.id.rentEdit);
        utilityEdit = (EditText)findViewById(R.id.utilityEdit);
        transportEdit = (EditText)findViewById(R.id.transEdit);




        Button setConButton = (Button)findViewById(R.id.setCont);
        setConButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gross = Double.valueOf(grossEdit.getText().toString());
                rent = Double.valueOf(rentEdit.getText().toString());
                utility = Double.valueOf(utilityEdit.getText().toString());
                transport = Double.valueOf(transportEdit.getText().toString());

                double expense = rent + utility + transport;
                Intent intent = new Intent(SetActivity.this, NetIncomeActivity.class);
                final  double netIncome = gross - expense;
                intent.putExtra("netIncome", netIncome);
                startActivity(intent);
            }
        });
    }
}

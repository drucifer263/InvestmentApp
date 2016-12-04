package com.example.sam.investmentapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NetIncomeActivity extends Activity {
    TextView netTextView;
    private String[] list = {"Google", "Netflix", "Instagram", "Facebook"};
    private ArrayAdapter<String> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_income);

        Bundle bundle = getIntent().getExtras();
        double getNet;
        netTextView = (TextView)findViewById(R.id.netTextView);

        ListView listView = (ListView) findViewById(R.id.listView);

        if(bundle != null){
            getNet = bundle.getDouble("netIncome");
            netTextView.setText("your Net Income : " + getNet);
            listAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
            listView.setAdapter(listAdapter);

        }
    }
}

package com.example.simpleclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvCount;
    Button btnClick, btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.btnClick);

        tvCount = (TextView) findViewById(R.id.tvCount);



        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = tvCount.getText().toString();

                int intCountValue = Integer.parseInt(countValue);
                intCountValue--;

                tvCount.setText(String.valueOf(intCountValue));
            }
        });


    }
}

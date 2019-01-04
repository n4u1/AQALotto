package com.example.fcit175.aqalotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);
        final TextView textView4 = findViewById(R.id.textView4);
        final TextView textView5 = findViewById(R.id.textView5);
        final TextView textView6 = findViewById(R.id.textView6);
        final Random random = new Random();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ArrayList<Integer> integerArrayList = new ArrayList<>();

                for (int i = 0; i < 6; i++) {
                    int num;
                    num = random.nextInt(46);

                    try {
                        for (int j = 0; j < 6; j++) {
                            while (integerArrayList.get(j) == num && integerArrayList.get(j) == 0) {
                                num = random.nextInt(46);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    integerArrayList.add(i, num);
                }

                Collections.sort(integerArrayList);

                textView1.setText(String.valueOf(integerArrayList.get(0)));
                textView2.setText(String.valueOf(integerArrayList.get(1)));
                textView3.setText(String.valueOf(integerArrayList.get(2)));
                textView4.setText(String.valueOf(integerArrayList.get(3)));
                textView5.setText(String.valueOf(integerArrayList.get(4)));
                textView6.setText(String.valueOf(integerArrayList.get(5)));


            }
        });


    }
}

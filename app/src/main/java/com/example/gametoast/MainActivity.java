package com.example.gametoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    TextView tV1, tV2, tV3, tV4, tV5, tV6;
    EditText etN1, etN2, etN3;
    Button btn1, btn2, btn3, btn4;
    ImageView iM1, iM2, iM3;

    int rnd1 = rnd.nextInt(90) + 10;
    int rnd2 = rnd.nextInt(90) + 10;

    int rnd3 = rnd.nextInt(90) + 10;
    int rnd4 = rnd.nextInt(90) + 10;

    String st1, st2, st3;

    int answer1;
    int answer2;
    int answer3;
    int count;
    int prc;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        tV6 = findViewById(R.id.tV6);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);
        iM1 = findViewById(R.id.iM1);
        iM2 = findViewById(R.id.iM2);
        iM3 = findViewById(R.id.iM3);
        tV1.setText("" + rnd1);
        tV2.setText("" + rnd2);
        tV3.setText("" + (rnd1 + rnd2));
        tV4.setText("" + rnd3);
        tV5.setText("" + (rnd1 + rnd2 + rnd3));
        tV6.setText("" + rnd4);
        tV3.setVisibility(View.INVISIBLE);
        tV4.setVisibility(View.INVISIBLE);
        etN2.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        iM2.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        etN3.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        iM3.setVisibility(View.INVISIBLE);


    }

    public void lol(View view) {
        String st = etN1.getText().toString();
        if (!st.isEmpty()) {
            answer1 = Integer.parseInt(st);
            if (answer1 == rnd1 + rnd2) {
                iM1.setImageResource(R.drawable.vi);
                count++;

            } else {
                iM1.setImageResource(R.drawable.x);
            }
            iM1.setVisibility(View.VISIBLE);
            tV3.setVisibility(View.VISIBLE);
            tV4.setVisibility(View.VISIBLE);
            etN2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn1.setVisibility(View.INVISIBLE);


        } else {
            Toast.makeText(this, "please enter the sum", Toast.LENGTH_LONG).show();


        }
    }

    public void lol2(View view) {
        String st2 = etN2.getText().toString();
        if (!st2.isEmpty()) {
            answer2 = Integer.parseInt(st2);
            if (answer2 == rnd1 + rnd2 + rnd3) {
                iM2.setImageResource(R.drawable.vi);
                count++;

            } else {
                iM2.setImageResource(R.drawable.x);
            }
            iM2.setVisibility(View.VISIBLE);
            tV5.setVisibility(View.VISIBLE);
            tV6.setVisibility(View.VISIBLE);
            etN3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.INVISIBLE);
        } else {
            Toast.makeText(this, "please enter the sum", Toast.LENGTH_LONG).show();

        }

    }



    public void lol3(View view) {
        String st3 = etN3.getText().toString();
        if(!st3.isEmpty()) {
            answer3 = Integer.parseInt(st3);
            if (answer3 == rnd1+rnd2+rnd3+rnd4){
                iM3.setImageResource(R.drawable.vi);
                count++;

            }
            else{
                iM3.setImageResource(R.drawable.x);
            }
            iM3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            prc=100*count/3;
            Toast.makeText(this, count+"/3" + prc + "% click for new game!", Toast.LENGTH_LONG).show();
            btn3.setVisibility(View.INVISIBLE);


        }
         else {
            Toast.makeText(this, "please enter the sum", Toast.LENGTH_LONG).show();
        }


        }


    public void lol4(View view)
    {
        iM1.setImageResource(R.drawable.img);
        iM2.setImageResource(R.drawable.img);
        iM3.setImageResource(R.drawable.img);
        tV3.setVisibility(View.INVISIBLE);
        tV4.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        etN1.setText("");
        etN2.setText("");
        etN3.setText("");
        etN2.setVisibility(View.INVISIBLE);
        etN3.setVisibility(View.INVISIBLE);
        iM1.setImageResource(R.drawable.img);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        count=0;
        prc=0;
        int rnd1 = rnd.nextInt(90)+10;
        int rnd2 = rnd.nextInt(90)+10;
        tV1.setText(String.valueOf(rnd1));
        tV2.setText(String.valueOf(rnd2));
        tV1.setText(""+rnd1);
        tV2.setText(""+rnd2);
        tV3.setText(""+rnd1+rnd2);
        tV4.setText(""+rnd3);
        tV1.setText(""+rnd1+rnd2+rnd3);
        tV1.setText(""+rnd4);

    }
}

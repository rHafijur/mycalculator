package com.facebook.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int input1;
    int input2;
    double result;
    String sign;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button div;
    Button mul;
    Button sub;
    Button sum;
    Button equals;
    Button c;
    TextView disp;
    TextView disp2;
    TextView signview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         one=findViewById(R.id.one);
         two=findViewById(R.id.two);
         three=findViewById(R.id.three);
         four=findViewById(R.id.four);
         five=findViewById(R.id.five);
         six=findViewById(R.id.six);
         seven=findViewById(R.id.seven);
         eight=findViewById(R.id.eight);
         nine=findViewById(R.id.nine);
         zero=findViewById(R.id.zero);
         div=findViewById(R.id.div);
         mul=findViewById(R.id.mul);
         sub=findViewById(R.id.sub);
         sum=findViewById(R.id.sum);
         equals=findViewById(R.id.equals);
         c=findViewById(R.id.c);
         disp=findViewById(R.id.disp);
        disp2=findViewById(R.id.disp2);
        signview=findViewById(R.id.sign);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(9);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToDisp(0);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSign("/");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSign("x");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSign("-");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSign("+");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1=Integer.parseInt(disp.getText().toString());
                input2=Integer.parseInt(disp2.getText().toString());

                if(sign!=null){
                   if (sign.equals("+")){
                       result= input1 + input2;
                   }else if(sign.equals("-")){
                       result=input1 - input2;
                   }else if(sign.equals("x")){
                       result=input1 * input2;
                   }else if(sign.equals("/")){
                       result=input1 / Double.valueOf(input2);
                   }
                   disp.setText(input1+sign+input2);
                   disp2.setText(result+"");
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp2.setText("");
                disp.setText("");
                signview.setText("");
                sign=null;
            }
        });
    }
    private void addToDisp(int number){
//        int curr=Integer.parseInt(disp.getText().toString());
        if(sign==null){
            String current=disp.getText().toString();
            current=current+number;
            disp.setText(current);
        }else{
            String current=disp2.getText().toString();
            current=current+number;
            disp2.setText(current);
        }
    }
    private void addSign(String sign){
        this.sign=sign;
        signview.setText(sign);
    }

}


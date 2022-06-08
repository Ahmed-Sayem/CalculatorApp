package com.example.calculatorxd;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display1,display2;
    private Button one,two,three,four,five,six,seven,eight,nine,zero,dzero,dot,plus,minus,multi,divide,percent,bracket,root,pi,clear,exponent,equal;
    private ImageButton backspace;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display1 = findViewById(R.id.display1);
        display2 = findViewById(R.id.display2);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dzero = findViewById(R.id.dzero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multi = findViewById(R.id.multi);
        dot = findViewById(R.id.dot);
        pi = findViewById(R.id.pi);
        exponent = findViewById(R.id.exponent);
        equal = findViewById(R.id.equal);
        bracket = findViewById(R.id.bracket);
        root = findViewById(R.id.root);
        clear = findViewById(R.id.clear);
        percent = findViewById(R.id.percent);
        backspace = findViewById(R.id.backspace);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"0");
            }
        });
        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"00");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"-");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"÷");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"×");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = "";
                display1.setText(data);
                display2.setText("0");
            }
        });
        exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"^");
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"3.14158");
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"sqrt(");
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                display1.setText(data+"%");
            }
        });
        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                int open = 0 ;
                int close = 0;
                for(int i=0;i<data.length();i++)
                {
                    if(data.charAt(i)=='(')
                        open++;
                    else if(data.charAt(i)==')')
                        close++;
                }
                if(open>close)
                    display1.setText(data+")");
                else
                    display1.setText(data+"(");
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = display1.getText().toString();
                data = data.substring(0,data.length()-1);
                display1.setText(data);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userExp = display1.getText().toString();

                userExp = userExp.replaceAll("÷","/");
                userExp = userExp.replaceAll("×","*");


                Expression exp = new Expression(userExp);
                String answer = String.valueOf(exp.calculate());

                if(answer=="NaN")
                {
                    answer=String.valueOf("Math Error");
                }
                display2.setText(answer);

            }
        });


    }
}
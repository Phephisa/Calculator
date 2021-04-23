package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //varibalesnames used on main activity
    EditText inputt1, inputt2;
    Button summ, multi;
    TextView anss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linking the new variables to xml code
        inputt1 = findViewById(R.id.input1);
        inputt2 = findViewById(R.id.input2);
        summ = findViewById(R.id.sum);
        multi = findViewById(R.id.mult);
        anss = findViewById(R.id.ans);

        //onclick event for the multiply button
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // changing input from the text label and passing it to integer
                int num1 = Integer.parseInt(inputt1.getText().toString());
                int num2 = Integer.parseInt(inputt2.getText().toString());
                //multiply the variables
                int multiply = num1 * num2;
                anss.setText("Answer: " + String.valueOf(multiply));
            }
        });
        //onclick event for the sum button
        summ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // changing input from the text label and passing it to integer
                int num1 = Integer.parseInt(inputt1.getText().toString());
                int num2 = Integer.parseInt(inputt2.getText().toString());
                //adding the variables
                int sum = num1 + num2;
                anss.setText("Answer: " + String.valueOf(sum));
            }
        });
    }


    /* //links to the buttons onClick name / predefined function by me
    public void Add(View v){
        // changing input from the text label and passing it to integer
        int num1 = Integer.parseInt(inputt1.getText().toString());
        int num2 = Integer.parseInt(inputt2.getText().toString());
        //adding the variables
        int sum = num1 + num2;
        int multiply = num1*num2;


        //switch statement to print depending on which button was clicked
        switch (v.getId()){
            case R.id.sum:
                anss.setText("" + sum);
                break;
            case R.id.mult:
                anss.setText("" + multiply);
                break;
        }



        /*if(v == findViewById(R.id.sum))
        {   //a toast to show the results of the program
            //Toast.makeText(this, ("The sum is " + sum), Toast.LENGTH_LONG).show();
            //displays on the TextView
            anss.setText("Answer: " + String.valueOf(sum));
        }

    } */
}
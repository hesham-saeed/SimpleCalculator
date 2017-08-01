package com.hesham.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = (EditText)findViewById(R.id.firstNumberEditText);
        secondNumberEditText = (EditText)findViewById(R.id.secondNumberEditText);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        addButton = (Button)findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumberEditText.getText().toString());
                double n2 = Double.parseDouble(secondNumberEditText.getText().toString());

                resultTextView.setText(String.valueOf(n1 + n2));

            }
        });

        subtractButton = (Button)findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumberEditText.getText().toString());
                double n2 = Double.parseDouble(secondNumberEditText.getText().toString());

                resultTextView.setText(String.valueOf(n1 - n2));
            }
        });

        multiplyButton = (Button)findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumberEditText.getText().toString());
                double n2 = Double.parseDouble(secondNumberEditText.getText().toString());

                resultTextView.setText(String.valueOf(n1 * n2));
            }
        });

        divideButton = (Button)findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumberEditText.getText().toString());
                double n2 = Double.parseDouble(secondNumberEditText.getText().toString());

                resultTextView.setText(String.valueOf(n1 / n2));
            }
        });






    }
}

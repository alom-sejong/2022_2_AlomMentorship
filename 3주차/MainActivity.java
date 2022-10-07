package com.example.alompractice;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;

    private EditText editText1;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(this);
        btnSub = findViewById(R.id.btn_sub);
        btnSub.setOnClickListener(this);
        btnMul = findViewById(R.id.btn_mul);
        btnMul.setOnClickListener(this);
        btnDiv = findViewById(R.id.btn_div);
        btnDiv.setOnClickListener(this);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
    }
            @Override
            public void onClick(View v) {
                double input1 = parseDouble(editText1.getText().toString());
                double input2 = parseDouble(editText2.getText().toString());
                double result = 0.0;
                boolean cheakDivZero = false;

                switch (v.getId()) {
                    case R.id.btn_add:
                        result = input1 + input2;
                        break;
                    case R.id.btn_sub:
                        result = input1 - input2;
                        break;
                    case R.id.btn_mul:
                        result = input1 * input2;
                        break;
                    case R.id.btn_div:
                        if (input2 == 0)
                            cheakDivZero = true;
                        result = input1 / input2;
                        break;
                }
                if (cheakDivZero)
                    textView.setText("0은 나눌수 없습니다!");

                else
                    textView.setText(Double.toString(result));
            };
};

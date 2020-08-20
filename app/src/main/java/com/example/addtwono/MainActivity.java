package com.example.addtwono;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);
        add=(Button)findViewById(R.id.btnAdd);
        result=(TextView)findViewById(R.id.tvAnswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                if (num2.getText().toString().length() == 0){
                    num2.setText("0");
                }
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sum=number1+number2;
                result.setText("Answer: "+String.valueOf(sum));

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.home:
                Toast.makeText(this,"home clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.first:
                Toast.makeText(this,"first clicked",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
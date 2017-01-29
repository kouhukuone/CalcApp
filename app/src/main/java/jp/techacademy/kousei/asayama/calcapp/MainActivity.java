package jp.techacademy.kousei.asayama.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

        public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);

        //EditText内の数値をdouble型に変換
        double value1 = Double.parseDouble(editText1.getText().toString());
        double value2 = Double.parseDouble(editText2.getText().toString());
        int enzansi = 0;

        //演算子の決定
        if (v.getId() == R.id.button1){
        enzansi = 1;
        } else if (v.getId() == R.id.button2){
        enzansi = 2;
        } else if (v.getId() == R.id.button3){
        enzansi = 3;
        } else if (v.getId() == R.id.button4){
        enzansi = 4;
        }

         intent.putExtra("VALUE1", value1);
         intent.putExtra("VALUE2", value2);
         intent.putExtra("VALUE3", enzansi);
        startActivity(intent);
        }

}

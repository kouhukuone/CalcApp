package jp.techacademy.kousei.asayama.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        int enzansi = intent.getIntExtra("VALUE3", 0);

        TextView textView = (TextView) findViewById(R.id.textView);

        //enzansi = 1:+, 2:-, 3:*, 4:/
        if(enzansi == 1){
        textView.setText(String.valueOf(value1 + value2));
        } else if (enzansi == 2){
            textView.setText(String.valueOf(value1 - value2));
        } else if (enzansi == 3){
            textView.setText(String.valueOf(value1 * value2));
        } else if(enzansi == 4){
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}

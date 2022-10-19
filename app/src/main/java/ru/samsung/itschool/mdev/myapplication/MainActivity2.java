package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv2;
    private Button btn3;
    public static final int RESULT_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2 = findViewById(R.id.textView2);
        btn3 = findViewById(R.id.button3);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            tv2.setText(bundle.getString("ccc"));
        }
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("ppp","Data from MainActivity2");
                setResult(RESULT_CODE, intent);
                finish(); // для явного унижточн.
            }
        });
    }
}
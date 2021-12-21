package com.example.sjcet.regform;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class Main2Activity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv =findViewById(R.id.tv);
        Intent intent = getIntent();
        SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
        String str = mypref.getString("tv",null);
        tv.setText(str);
    }
}


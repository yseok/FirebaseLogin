package com.yuseok.android.firebaselogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inapp);

        Intent intent=new Intent(this.getIntent());
        String s=intent.getStringExtra("text");
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(s);
    }
}

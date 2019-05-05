package com.example.win.lab5_webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_url;
    Button browse3;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_url = findViewById(R.id.et_url);
        browse3 = (Button) findViewById(R.id.btn_browse3);
        browse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                url= et_url.getText().toString();
                Uri content_url = Uri.parse(url);//此处填链接
                intent.setData(content_url);
                startActivity(intent);
            }
        });
    }
}

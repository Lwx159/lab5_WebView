# lab5_WebView

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/et_url"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerInParent="true"
        android:text="@string/url"/>


    <Button
        android:id="@+id/btn_browse3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/et_url"
        android:layout_centerInParent="true"
        android:text="@string/browse3"/>

</RelativeLayout>
```
MainActivity.java
```
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
```

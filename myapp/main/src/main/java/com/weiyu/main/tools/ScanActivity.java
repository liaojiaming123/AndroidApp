package com.weiyu.main.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.didi.drouter.annotation.Router;
import com.weiyu.main.R;

@Router(path = "/scan_activity")
public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
    }
}
package com.weiyu.main.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.didi.drouter.annotation.Router;
import com.weiyu.main.R;

@Router(path = "/transfer_activity")
public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
    }
}
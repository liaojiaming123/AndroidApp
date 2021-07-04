package com.weiyu.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.didi.drouter.annotation.Router;
import com.didi.drouter.api.DRouter;

@Router(path = "/main_activity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvDownload = (TextView)findViewById(R.id.tv_download);
        tvDownload.setOnClickListener(v -> {
            DRouter.build("/download_activity").start();
        });
        TextView tvScan = (TextView)findViewById(R.id.tv_scan);
        tvScan.setOnClickListener(v -> {
            DRouter.build("/scan_activity").start();
        });
        TextView tvTransfer = (TextView)findViewById(R.id.tv_transfer);
        tvTransfer.setOnClickListener(v -> {
            DRouter.build("/transfer_activity").start();
        });
    }
}
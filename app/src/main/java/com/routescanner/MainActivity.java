package com.routescanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final int ACCESSIBILITY_REQUEST = 1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnEnableAccessibility = findViewById(R.id.btn_enable_accessibility);
        Button btnStartScan = findViewById(R.id.btn_start_scan);
        TextView tvStatus = findViewById(R.id.tv_status);
        
        btnEnableAccessibility.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            startActivityForResult(intent, ACCESSIBILITY_REQUEST);
        });
        
        btnStartScan.setOnClickListener(v -> {
            tvStatus.setText("Escaneando... Abre Amazon Flex y haz scroll");
            Toast.makeText(this, "Escáner activo. Abre Flex y haz scroll.", Toast.LENGTH_LONG).show();
        });
    }
}

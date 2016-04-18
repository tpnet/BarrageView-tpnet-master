package com.example.tpnet.barrageview_tpnet_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BarrageView bvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bvText = (BarrageView) findViewById(R.id.bv_text);
        bvText.setOnClickActionListener(new BarrageView.OnClickActionListener() {
            @Override
            public void onClick(String str) {
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

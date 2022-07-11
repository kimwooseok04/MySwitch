package com.example.myswitch;

import static com.example.myswitch.R.id.btn_begin;
import static com.example.myswitch.R.id.radio_button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout_1;
    ImageView img_view;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_1 = findViewById(R.id.layout_1);
        img_view = findViewById(R.id.img_view);
        switch1 = findViewById(R.id.switch1);

        findViewById(R.id.switch1).setOnClickListener(this);
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);
        findViewById(btn_begin).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.switch1:
                //클릭했으면 아래그림 보이게, 아니면 안보이게
                if(switch1.isChecked())
                    layout_1.setVisibility(View.VISIBLE);
                else
                    layout_1.setVisibility(View.INVISIBLE);
                break;
            case R.id.radio_button1://그림 바꾸기
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button2://그림 바꾸기
                img_view.setImageResource(R.drawable.an9);
                break;
            case R.id.radio_button3://그림 바꾸기
                img_view.setImageResource(R.drawable.an10);
                break;
            case R.id.btn_exit:
                finish();
                break;
            case btn_begin:
                switch1.performClick();
                break;
        }
    }
}
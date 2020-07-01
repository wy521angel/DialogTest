package com.wy521angel.dialogtest;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DialogFragmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);

        findViewById(R.id.tv_show_my_dialog1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog1 myDialog1 = new MyDialog1();
                myDialog1.show(getSupportFragmentManager(), "MyDialog1");
            }
        });
    }
}

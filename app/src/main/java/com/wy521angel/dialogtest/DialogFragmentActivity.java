package com.wy521angel.dialogtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

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

        findViewById(R.id.tv_show_my_dialog2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog2 myDialog2 = new MyDialog2();
                myDialog2.show(getSupportFragmentManager(), "MyDialog2");
            }
        });

        findViewById(R.id.tv_show_my_dialog3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog2 myDialog2 = new MyDialog2();
                myDialog2.setStyle(DialogFragment.STYLE_NORMAL, R.style.dialogFullScreen2);//添加style
                myDialog2.show(getSupportFragmentManager(), "MyDialog3");
            }
        });


        findViewById(R.id.tv_show_my_dialog4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MyDialog3 myDialog3 = new MyDialog3();
                //方法一
//                myDialog3.setStyle(DialogFragment.STYLE_NORMAL, R.style.dialogNotDismiss);//添加style
                //方法二
//在dialog中添加 getDialog().setCanceledOnTouchOutside(false);
                myDialog3.show(getSupportFragmentManager(), "MyDialog4");

                myDialog3.setDialogListener(new MyDialog3.DialogListener() {
                    @Override
                    public void onSure() {
                        Toast.makeText(DialogFragmentActivity.this, "sure", Toast.LENGTH_SHORT).show();
                        myDialog3.dismissAllowingStateLoss();
                    }

                    @Override
                    public void onCancel() {
                        Toast.makeText(DialogFragmentActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                        myDialog3.dismissAllowingStateLoss();
                    }
                });
            }
        });

        findViewById(R.id.tv_show_my_dialog5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog4 myDialog4 = new MyDialog4();
                myDialog4.setStyle(DialogFragment.STYLE_NORMAL, R.style.dialogFullScreen2);//添加style
                myDialog4.show(getSupportFragmentManager(), "MyDialog5");
            }
        });

        findViewById(R.id.tv_show_my_dialog6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog5 myDialog5 = new MyDialog5();
                myDialog5.show(getSupportFragmentManager(), "MyDialog6");
            }
        });

        findViewById(R.id.tv_show_my_dialog7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog6 myDialog6 = new MyDialog6();
                myDialog6.show(getSupportFragmentManager(), "MyDialog7");
            }
        });

        findViewById(R.id.tv_show_my_dialog8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog7 myDialog7 = new MyDialog7();
                myDialog7.show(getSupportFragmentManager(), "MyDialog8");
            }
        });
    }
}

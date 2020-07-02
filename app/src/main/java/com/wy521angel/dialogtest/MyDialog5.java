package com.wy521angel.dialogtest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/**
 * 以Dialog创建DialogFragment
 */
public class MyDialog5 extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //创建对话框，需要返回dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("测试Dialog");
        builder.setMessage("启动另外一个对话框");
        builder.setPositiveButton("启动", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MyDialog2 myDialog2 = new MyDialog2();
                myDialog2.setTargetFragment(MyDialog5.this, 300);
                myDialog2.setStyle(DialogFragment.STYLE_NORMAL, R.style.dialogFullScreen1);
                myDialog2.show(getFragmentManager(), "myDialog2");

            }
        });
        return builder.create();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //此方法在视图已经创建后返回的，但是这个view还没有添加到父级中，我们在这里可以重新设定view的各个数据
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //这里可以返回 MyDialog2  Fragment的数据
    }
}

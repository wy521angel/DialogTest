package com.wy521angel.dialogtest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/**
 * 以Dialog创建DialogFragment
 */
public class MyDialog1 extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //创建对话框，需要返回dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("MyDialog1");
        builder.setMessage("以Dialog创建DialogFragment");
        return builder.create();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //此方法在视图已经创建后返回的，但是这个view还没有添加到父级中，我们在这里可以重新设定view的各个数据
    }
}

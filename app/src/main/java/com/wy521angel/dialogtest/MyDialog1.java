package com.wy521angel.dialogtest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
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
//        builder.setTitle("MyDialog1")
//                .setMessage("以Dialog创建DialogFragment")
//                .setPositiveButton("确定", null)
//                .setNegativeButton("取消", null)
//                .setCancelable(false);

        //也可以使用自定义 View 来创建：
//        LayoutInflater inflater = getActivity().getLayoutInflater();
//        View view = inflater.inflate(R.layout.dialog_sure, null);
//        builder.setView(view);
//        return builder.create();

        //另一种方法：
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_sure, null);
        Dialog dialog = new Dialog(getActivity());
        // 设置主题的构造方法
        // Dialog dialog = new Dialog(getActivity(), R.style.CustomDialog);
        dialog.setContentView(view);
        // Do Someting
        return dialog;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //此方法在视图已经创建后返回的，但是这个view还没有添加到父级中，我们在这里可以重新设定view的各个数据
    }
}

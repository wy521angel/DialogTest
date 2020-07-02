package com.wy521angel.dialogtest;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/**
 * 以布局View创建DialogFragment
 * DialogFragment另一种创建内容方法，导入一个View
 */
public class MyDialog4 extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_input, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        EditText editPassword = view.findViewById(R.id.et_input);
        editPassword.requestFocus();//设置焦点
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);//设置输入键盘可见
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        WindowManager.LayoutParams params = getDialog().getWindow().getAttributes();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
//        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        params.gravity = Gravity.BOTTOM; //将对话框放到布局下面，也就是屏幕下方
        getDialog().getWindow().setAttributes((WindowManager.LayoutParams) params);
        super.onStart();
    }
}

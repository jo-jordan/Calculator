package com.lzjlxebr.util;

import android.content.Context;
import android.widget.Toast;

public class ToastToaster {
    public static void toast(Context context, String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}

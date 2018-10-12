package com.lzjlxebr.util;

import android.content.Context;
import android.widget.Toast;

/**
 * @author lzjlxebr
 * @since 2018/10/12
 *
 */
public class ToastToaster {
    public static void toast(Context context, String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}

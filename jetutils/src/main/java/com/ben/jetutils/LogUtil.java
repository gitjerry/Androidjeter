package com.ben.jetutils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 *
 */
public class LogUtil {
    private static final boolean IS_DEBUG = true;
    private static final String DEFAULT_TAG = "xiaoxi";

    public static void i(String tag, String msg){
        if(IS_DEBUG){
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg){
        if(IS_DEBUG){
            Log.e(tag, ""+msg);
        }
    }

    public static void i(String msg){
        if(IS_DEBUG){
            Log.i(DEFAULT_TAG, msg);
        }
    }

    public static void e(String msg){
        if(IS_DEBUG){
            Log.e(DEFAULT_TAG,""+ msg);
        }
    }

    public static void showToast(Context context, String msg){
        if(IS_DEBUG){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }
}

package com.test.jack.testviewpager.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by jack on 2016/4/9.
 */
public class Utils {
    public static void openClass(Context context,Class mclass){
        Intent intent = new Intent();
        intent.setClass(context,mclass);
        context.startActivity(intent);

    }
}

package com.diabin.latte.app.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.diabin.latte.app.app.Latte;

/**
 * Created by tan on 2017/11/15.
 */

public class DimenUtil {
    public static int getScreenWidth(){
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }
    public static int getScreenHeight(){
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}

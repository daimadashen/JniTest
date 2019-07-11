package com.nanguiyu.jnitest;

import android.graphics.Bitmap;

public class JniTest {
    static {
        System.loadLibrary("JniTest-lib");
    }

    public native String stringFromJNI();

    public native int intFromJNI();

    public native int[] intArrayFromJNI();

    public native void convertGreyBitmap(Bitmap bitmap);
}

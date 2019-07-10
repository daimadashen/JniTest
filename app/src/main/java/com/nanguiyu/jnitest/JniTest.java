package com.nanguiyu.jnitest;

public class JniTest {
    static {
        System.loadLibrary("JniTest-lib");
    }

    public native String stringFromJNI();
}

package com.nanguiyu.jnitest;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JniTest jniTest = new JniTest();
        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(jniTest.stringFromJNI());

        TextView tv2 = findViewById(R.id.num);
        tv2.setText(jniTest.intFromJNI()+"");


        TextView tv3 = findViewById(R.id.nums);
        int[] ints = jniTest.intArrayFromJNI();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ ");
        for(int i:ints){
            stringBuffer.append(i);
            stringBuffer.append(',');
        }
        stringBuffer.append(" ]");
        tv3.setText(stringBuffer);

        ImageView imageView = findViewById(R.id.image);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.tx14254);
        jniTest.convertGreyBitmap(bitmap);
        imageView.setImageBitmap(bitmap);

    }

}

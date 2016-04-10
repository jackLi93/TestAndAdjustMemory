package com.test.jack.testviewpager.activity;

import android.content.Intent;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.test.jack.testviewpager.MainActivity;
import com.test.jack.testviewpager.R;
import com.test.jack.testviewpager.util.Utils;


/**
 * Created by jack on 2016/4/9.
 */
public class SplashActivity extends AppCompatActivity {
    private final static  String TAG = "Splash";
    private ImageView splash_img;
    private Bitmap mBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);
        Log.i(TAG, "onCreate");
        splash_img = (ImageView) findViewById(R.id.spalash_image);
        BitmapFactory.Options options = new BitmapFactory.Options();
       // 001:效果差使用之后内存占用下降，但是图片效果很差，甚至一片黑暗options.inPreferredConfig = Bitmap.Config.ARGB_4444;
      //002：效果好，对图片进行了缩放内存占用降低。但是应该更优化缩放的比例。

        options.inSampleSize = 2;

        mBackground= BitmapFactory.decodeResource(getResources(), R.drawable.splash,options);
        splash_img.setImageBitmap(mBackground);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Utils.openClass(SplashActivity.this, MainActivity.class);
         /*       Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);*/
                SplashActivity.this.finish();


            }
        }, 3000);
    }



    @Override
    public void finish() {
        super.finish();
        Log.i(TAG,"finish");
 /*       if(mBackground!=null){
            mBackground.recycle();
            mBackground=null;
        }*/
        Drawable drawable = splash_img.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            bitmap.recycle();
            Log.i(TAG,"bg recycled");
        }
       System.gc();
    }
}

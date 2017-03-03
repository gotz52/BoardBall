package com.example.h_yoshikawa.boardball;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    // リソースファイル名
    int resource_name = R.drawable.field;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //画面を縦方向で固定する
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //レイアウトを用意する
        RelativeLayout l = new RelativeLayout(this);
        setContentView(l);
        //Viewをセットする
        l.addView(new BoardView(this));


    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //int width = findViewById(R.id.image_view).getWidth();
        //Log.d("width=",Integer.toString(width));
    }

}

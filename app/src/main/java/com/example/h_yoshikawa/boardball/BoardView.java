package com.example.h_yoshikawa.boardball;

/**
 * Created by h-yoshikawa on 2017/03/03.
 */

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by hiroki on 2017/03/02.
 */
public class BoardView extends View {
    private Paint paint = new Paint();
    //画像読み込みaa
    private Resources res = this.getContext().getResources();
    private Bitmap IMG_BOARD = BitmapFactory.decodeResource(res, R.drawable.field);
    private int dp_w;
    private int dp_h;
    private int drow_h;
    private int drow_s;
    private int aaa;

    private final int TITLE = 0;
    private final int PLAYER = 1;
    private final int COM = 2;
    private final int TURN = 3;
    private final int REVERS = 4;
    private final int CONTROL = 5;
    private final int PASS = 6;
    private final int RESULT = 7;

    private int[][] board = new int[5][3];
    private int page = TITLE;

    public BoardView(Context context) {
        super(context);

        // リソースからbitmapを作成
        //bmp = BitmapFactory.decodeResource(context.getResources(), resource_name);
        // WindowManager取得
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        // Displayインスタンス生成
        Display dp = wm.getDefaultDisplay();
        // ディスプレイサイズ取得
        dp_w = dp.getWidth();
        dp_h = dp.getHeight();
        // リサイズ画像の高さ
        drow_h = (dp_w / 2) * 3;
        // 描画始点の高さ
        drow_s = (dp_h - drow_h) / 2;
    }

    //描写処理
    @Override
    public void onDraw(Canvas c) {
        int i;
        IMG_BOARD = Bitmap.createScaledBitmap(IMG_BOARD, dp_w, drow_h/10*9 , true);
        //ボードを表示
        c.drawBitmap(IMG_BOARD, 0, 0, paint);


        switch(page) {
            case TITLE:
                break;
            case TURN:
                break;
            case PLAYER:
                break;
            case COM:
                break;
            case REVERS:
                break;
            case CONTROL:
                break;
            case PASS:
                break;
            case RESULT:
                break;
        }
    }

    //タッチ入力処理
    public boolean onTouchEvent(MotionEvent me) {
        //タッチされた時
        if(me.getAction()==MotionEvent.ACTION_DOWN) {
            switch(page) {
                case TITLE:
                    break;
                case PLAYER:
                    break;
                case COM:
                    break;
                case PASS:
                    break;
                case RESULT:
                    break;
            }
        }
        return true;
    }
}


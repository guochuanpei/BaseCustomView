package com.minshu.customview.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：郭传沛 on 2017/9/16 16:46
 * 邮箱：bestyourselfgcp@163.com
 * 类用途: 自定义绘画板
 */

public class BasicView extends View {
    private Paint mPaint;

    public BasicView(Context context) {
        super(context);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);//设置画笔颜色
        mPaint.setAntiAlias(true);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    private void doDraw(Canvas canvas) {
       setPaintStyle(Paint.Style.STROKE);//暴露方法修改画笔的样式

    }

    public void setPaintStyle(Paint.Style paintStyle) {
        if (paintStyle == null) {
            mPaint.setStyle(Paint.Style.STROKE);
        }
        mPaint.setStyle(paintStyle);
    }
}

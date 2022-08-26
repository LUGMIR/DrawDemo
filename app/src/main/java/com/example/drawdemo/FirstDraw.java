package com.example.drawdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class FirstDraw extends View {

    Paint paint;

    public FirstDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 250,paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(150f);
        canvas.drawText(getWidth() + " " + getHeight(), 10, 150, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(50, 1200, 800, 1500, paint);

        //строим координатную сетку
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(3);
        for (int i=0; i < getWidth(); i+=50){
            canvas.drawLine(i, 0,i,getHeight(), paint);
        }

        for (int i=0; i < getHeight(); i+=50){
            canvas.drawLine(0,i,getWidth(),i,paint);
        }

    }




}


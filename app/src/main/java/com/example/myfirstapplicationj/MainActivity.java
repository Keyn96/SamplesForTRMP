package com.example.myfirstapplicationj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }

    static class DrawView extends View {
        Paint p;
        Rect rect;
        StringBuilder stringBuilder;
        public DrawView(Context context) {

            super(context);
            p = new Paint();
            rect = new Rect(100,200,200,300);
            stringBuilder = new StringBuilder();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80,102,204,255);
            p.setColor(Color.BLUE);
            p.setStrokeWidth(10);
            p.setTextSize(30);
            stringBuilder.setLength(0);
            stringBuilder.append("width = ").append(getWidth()).append(", height = ").append(getHeight());
            canvas.drawText(stringBuilder.toString(),100,100, p);
            p.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, p);
            p.setStyle(Paint.Style.STROKE);
            rect.offset(150,0);
            canvas.drawRect(rect, p);
            p.setStyle(Paint.Style.FILL_AND_STROKE);
            rect.offset(150,0);
            canvas.drawRect(rect, p);
        }
    }

}
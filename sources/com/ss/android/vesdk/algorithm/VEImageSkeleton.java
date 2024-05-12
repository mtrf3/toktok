package com.ss.android.vesdk.algorithm;

import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes17.dex */
public class VEImageSkeleton {
    public int ID;
    public PointF[] points;
    public RectF rect;

    public int getID() {
        return this.ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}

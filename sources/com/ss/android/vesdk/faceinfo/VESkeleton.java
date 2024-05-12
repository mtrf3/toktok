package com.ss.android.vesdk.faceinfo;

import X.X1D;
import android.graphics.PointF;
import android.graphics.RectF;
import defpackage.q;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VESkeleton {
    public int ID;
    public PointF[] points;
    public RectF rect;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VESkeleton{rect=");
        LIZ.append(this.rect);
        LIZ.append(", ID=");
        LIZ.append(this.ID);
        LIZ.append(", points=");
        return q.LIZIZ(LIZ, Arrays.toString(this.points), '}', LIZ);
    }

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

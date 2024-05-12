package com.ss.bytertc.engine.video;

import X.X1D;

/* loaded from: classes33.dex */
public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rectangle{x=");
        LIZ.append(this.x);
        LIZ.append(", y=");
        LIZ.append(this.y);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public Rectangle(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }
}

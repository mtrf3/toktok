package com.ss.bytertc.engine;

import X.X1D;

/* loaded from: classes33.dex */
public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalSourceWantedData{width='");
        LIZ.append(this.width);
        LIZ.append('\'');
        LIZ.append(", height='");
        LIZ.append(this.height);
        LIZ.append('\'');
        LIZ.append(", frameRate='");
        LIZ.append(this.frameRate);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public InternalSourceWantedData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }

    public static InternalSourceWantedData create(int i, int i2, int i3) {
        return new InternalSourceWantedData(i, i2, i3);
    }
}

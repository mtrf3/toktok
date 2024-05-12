package com.ss.android.vesdk.clipparam;

import X.X1D;

/* loaded from: classes3.dex */
public class VEClipAlgorithmParam {
    public static int BINGO_EFFECT_NULL = 0;
    public static int BINGO_EFFECT_ZOOMIN = 1;
    public static int BINGO_EFFECT_ZOOMOUT = 2;
    public int bingoEffect;
    public int index;
    public int range;
    public int rotate;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("index: ");
        LIZ.append(this.index);
        LIZ.append(", trimIn: ");
        LIZ.append(this.trimIn);
        LIZ.append(", trimOut: ");
        LIZ.append(this.trimOut);
        LIZ.append(", range: ");
        LIZ.append(this.range);
        LIZ.append(", bingoEffect: ");
        LIZ.append(this.bingoEffect);
        LIZ.append(", rotate: ");
        LIZ.append(this.rotate);
        return X1D.LIZIZ(LIZ);
    }
}

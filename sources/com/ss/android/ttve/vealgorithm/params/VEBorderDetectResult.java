package com.ss.android.ttve.vealgorithm.params;

import X.X1D;
import defpackage.b0;

/* loaded from: classes16.dex */
public class VEBorderDetectResult extends VEAlgorithmResult {
    public int frameHeight;
    public int frameWidth;
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEBorderDetectResult{x1=");
        LIZ.append(this.x1);
        LIZ.append(", y1=");
        LIZ.append(this.y1);
        LIZ.append(", x2=");
        LIZ.append(this.x2);
        LIZ.append(", y2=");
        LIZ.append(this.y2);
        LIZ.append(", frameWidth=");
        LIZ.append(this.frameWidth);
        LIZ.append(", frameHeight=");
        return b0.LIZJ(LIZ, this.frameHeight, '}', LIZ);
    }

    public VEBorderDetectResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
        this.x1 = i;
        this.y1 = i2;
        this.x2 = i3;
        this.y2 = i4;
        this.frameWidth = i5;
        this.frameHeight = i6;
    }
}

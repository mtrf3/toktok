package com.ss.android.vesdk.clipparam;

import X.X1D;

/* loaded from: classes2.dex */
public class VEClipParam {
    public int clipIndex;
    public int clipRotate;
    public int clipType;
    public String path;
    public int seqIn;
    public int seqOut;
    public double speed;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEClipParam: clipType=");
        LIZ.append(this.clipType);
        LIZ.append("path=");
        LIZ.append(this.path);
        LIZ.append(" trimIn=");
        LIZ.append(this.trimIn);
        LIZ.append(" trimOut:=");
        LIZ.append(this.trimOut);
        LIZ.append(" speed=");
        LIZ.append(this.speed);
        LIZ.append(" clipRotate=");
        LIZ.append(this.clipRotate);
        return X1D.LIZIZ(LIZ);
    }
}

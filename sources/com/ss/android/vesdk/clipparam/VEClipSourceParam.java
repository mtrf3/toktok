package com.ss.android.vesdk.clipparam;

import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes3.dex */
public class VEClipSourceParam {
    public int clipColorValue;
    public int clipHeight;
    public int clipRefIndex;
    public int clipWidth;
    public int sourceType;
    public String clipFilePath = "";
    public String clipSegmentId = "";

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEClipSourceParam{sourceType=");
        LIZ.append(this.sourceType);
        LIZ.append(", clipFilePath='");
        Q89.LIZIZ(LIZ, this.clipFilePath, '\'', ", clipSegmentId='");
        Q89.LIZIZ(LIZ, this.clipSegmentId, '\'', ", clipRefIndex=");
        LIZ.append(this.clipRefIndex);
        LIZ.append(", clipColorValue=");
        LIZ.append(this.clipColorValue);
        LIZ.append(", clipWidth=");
        LIZ.append(this.clipWidth);
        LIZ.append(", clipHeight=");
        return b0.LIZJ(LIZ, this.clipHeight, '}', LIZ);
    }
}

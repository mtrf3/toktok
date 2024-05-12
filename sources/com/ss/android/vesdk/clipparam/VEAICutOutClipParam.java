package com.ss.android.vesdk.clipparam;

import X.C77800Ug8;
import X.InterfaceC87314YOo;
import X.Q89;
import X.X1D;

/* loaded from: classes2.dex */
public class VEAICutOutClipParam {
    public InterfaceC87314YOo listener;
    public int trimIn;
    public int trimOut;
    public String mWorkSpace = "";
    public String mModelPath = "";
    public int archerStrategy = -1;
    public String originPicForMask = "";

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAICutOutClipParam{trimIn=");
        LIZ.append(this.trimIn);
        LIZ.append(", maskPath='");
        Q89.LIZIZ(LIZ, this.mWorkSpace, '\'', ", mModelPath='");
        Q89.LIZIZ(LIZ, this.mModelPath, '\'', ", trimOut='");
        LIZ.append(this.trimOut);
        LIZ.append('\'');
        LIZ.append(", archerStrategy='");
        LIZ.append(this.archerStrategy);
        LIZ.append('\'');
        LIZ.append(", originPicForMask='");
        return C77800Ug8.LIZJ(LIZ, this.originPicForMask, '\'', '}', LIZ);
    }
}

package com.ss.android.vesdk.clipparam;

import X.Q89;
import X.X1D;
import com.ss.android.vesdk.ROTATE_DEGREE;
import defpackage.b0;

/* loaded from: classes3.dex */
public class VECommonClipParam {
    public String mp4DecryptionKey;
    public String path;
    public int trimIn = -1;
    public int trimOut = -1;
    public double speed = 1.0d;
    public int seqIn = -1;
    public int seqOut = -1;
    public int videoClipRotate = ROTATE_DEGREE.ROTATE_NONE.ordinal();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECommonClip{trimIn=");
        LIZ.append(this.trimIn);
        LIZ.append(", trimOut=");
        LIZ.append(this.trimOut);
        LIZ.append(", path='");
        Q89.LIZIZ(LIZ, this.path, '\'', ", mp4DecryptionKey='");
        Q89.LIZIZ(LIZ, this.mp4DecryptionKey, '\'', ", speed=");
        LIZ.append(this.speed);
        LIZ.append(", seqIn=");
        LIZ.append(this.seqIn);
        LIZ.append(", seqOut=");
        LIZ.append(this.seqOut);
        LIZ.append(", videoClipRotate=");
        return b0.LIZJ(LIZ, this.videoClipRotate, '}', LIZ);
    }
}

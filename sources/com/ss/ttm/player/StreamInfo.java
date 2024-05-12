package com.ss.ttm.player;

import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes3.dex */
public class StreamInfo {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StreamInfo{mStreamType=");
        LIZ.append(this.LIZ);
        LIZ.append(", mStreamIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mCodecName='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mFrameRate=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mBitrate=");
        LIZ.append(this.LJ);
        LIZ.append(", mWidth=");
        LIZ.append(this.LJFF);
        LIZ.append(", mHeight=");
        LIZ.append(this.LJI);
        LIZ.append(", mSampleRate=");
        LIZ.append(this.LJII);
        LIZ.append(", mChannels=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mDuration=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mRotation=");
        return b0.LIZJ(LIZ, this.LJIIJ, '}', LIZ);
    }

    public StreamInfo(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = -1;
        this.LJII = -1;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = j;
        this.LJIIJ = i9;
    }
}

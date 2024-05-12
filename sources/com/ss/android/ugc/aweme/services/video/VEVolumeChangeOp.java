package com.ss.android.ugc.aweme.services.video;

import X.C74221TAz;
import X.X1D;

/* loaded from: classes3.dex */
public class VEVolumeChangeOp {
    public final int mEnd;
    public final int mStart;
    public final int mType;
    public final int mVoiceType;
    public final float mVolume;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVolumeChangeOp{mType=");
        LIZ.append(this.mType);
        LIZ.append(", mVolume=");
        return C74221TAz.LIZLLL(LIZ, this.mVolume, '}', LIZ);
    }

    public static VEVolumeChangeOp ofMusic(float f) {
        return new VEVolumeChangeOp(1, f);
    }

    public static VEVolumeChangeOp ofRecord(float f) {
        return new VEVolumeChangeOp(2, f);
    }

    public static VEVolumeChangeOp ofVoice(float f) {
        return new VEVolumeChangeOp(0, f);
    }

    public VEVolumeChangeOp(int i, float f) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = -1;
        this.mEnd = -1;
    }

    public static VEVolumeChangeOp ofVoice(float f, int i, int i2, int i3) {
        return new VEVolumeChangeOp(0, f, i, i2, i3);
    }

    public VEVolumeChangeOp(int i, float f, int i2, int i3, int i4) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = i2;
        this.mEnd = i3;
        this.mVoiceType = i4;
    }
}

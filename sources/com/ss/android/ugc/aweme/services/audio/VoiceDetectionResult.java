package com.ss.android.ugc.aweme.services.audio;

import X.C1JX;
import X.C48339Iy7;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceDetectionResult {
    public int errorCode;
    public String errorMsg;
    public boolean matchThreshold;
    public double threshold;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceDetectionResult() {
        this(0, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VoiceDetectionResult copy$default(VoiceDetectionResult voiceDetectionResult, int i, String str, double d, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = voiceDetectionResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = voiceDetectionResult.errorMsg;
        }
        if ((i2 & 4) != 0) {
            d = voiceDetectionResult.threshold;
        }
        if ((i2 & 8) != 0) {
            z = voiceDetectionResult.matchThreshold;
        }
        return voiceDetectionResult.copy(i, str, d, z);
    }

    public final VoiceDetectionResult copy(int i, String str, double d, boolean z) {
        return new VoiceDetectionResult(i, str, d, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceDetectionResult)) {
            return false;
        }
        VoiceDetectionResult voiceDetectionResult = (VoiceDetectionResult) obj;
        return this.errorCode == voiceDetectionResult.errorCode && o.LJ(this.errorMsg, voiceDetectionResult.errorMsg) && Double.compare(this.threshold, voiceDetectionResult.threshold) == 0 && this.matchThreshold == voiceDetectionResult.matchThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int i = this.errorCode * 31;
        String str = this.errorMsg;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = C1JX.LIZIZ(this.threshold, (i + hashCode) * 31, 31);
        boolean z = this.matchThreshold;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return LIZIZ + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceDetectionResult(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg=");
        LIZ.append(this.errorMsg);
        LIZ.append(", threshold=");
        LIZ.append(this.threshold);
        LIZ.append(", matchThreshold=");
        return C48339Iy7.LIZJ(LIZ, this.matchThreshold, ')', LIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean getMatchThreshold() {
        return this.matchThreshold;
    }

    public final double getThreshold() {
        return this.threshold;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setMatchThreshold(boolean z) {
        this.matchThreshold = z;
    }

    public final void setThreshold(double d) {
        this.threshold = d;
    }

    public VoiceDetectionResult(int i, String str, double d, boolean z) {
        this.errorCode = i;
        this.errorMsg = str;
        this.threshold = d;
        this.matchThreshold = z;
    }

    public /* synthetic */ VoiceDetectionResult(int i, String str, double d, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i2 & 8) != 0 ? false : z);
    }
}

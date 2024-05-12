package com.ss.android.vesdk;

import X.C07670Rv;
import X.X1D;

/* loaded from: classes3.dex */
public class LoudnessDetectResult {
    public double avgLoudness;
    public double peakLoudness;
    public int result;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoudnessDetectResult{result=");
        LIZ.append(this.result);
        LIZ.append(", avgLoudness=");
        LIZ.append(this.avgLoudness);
        LIZ.append(", peakLoudness=");
        return C07670Rv.LIZ(LIZ, this.peakLoudness, '}', LIZ);
    }
}

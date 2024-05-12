package com.mammon.audiosdk;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class AutoVolume {
    public static native float Native_GetAutoVolume(float[] fArr);

    static {
        C16880lQ.LLJJJIL("audioeffect");
    }

    public static float GetAutoVolume(float[] fArr) {
        return Native_GetAutoVolume(fArr);
    }
}

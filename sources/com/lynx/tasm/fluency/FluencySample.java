package com.lynx.tasm.fluency;

/* loaded from: classes7.dex */
public class FluencySample {
    public static boolean LIZ;

    public static native void nativeSetFluencySample(boolean z);

    public static void LIZ(boolean z) {
        LIZ = z;
        nativeSetFluencySample(z);
    }
}

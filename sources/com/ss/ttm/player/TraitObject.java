package com.ss.ttm.player;

/* loaded from: classes9.dex */
public class TraitObject {
    public final int LIZ = 0;

    private native void nativeRelease(long j);

    private long takeNativeObj() {
        return 0L;
    }

    public final void LIZ() {
        long takeNativeObj = takeNativeObj();
        if (takeNativeObj != 0) {
            try {
                nativeRelease(takeNativeObj);
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }

    public boolean sameAs(TraitObject traitObject) {
        if (traitObject == null) {
            return false;
        }
        return equals(traitObject);
    }
}

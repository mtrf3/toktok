package com.bytedance.common.jato.dex;

import X.C48693J9d;

/* loaded from: classes7.dex */
public class DexTricksNativeHolder {
    public static boolean sInited;

    public static native int dvmVerifyEnableNative();

    public static native int dvmVerifyNoneNative();

    public static native int verifyEnableNative();

    public static native int verifyNoneNative(int i, int i2);

    public static synchronized boolean ensureInited() {
        boolean z;
        synchronized (DexTricksNativeHolder.class) {
            if (!sInited && C48693J9d.LJFF()) {
                sInited = true;
            }
            z = sInited;
        }
        return z;
    }

    public static int dvmVerifyEnable() {
        int i = -1;
        if (ensureInited()) {
            try {
                i = dvmVerifyEnableNative();
                return i;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return i;
    }

    public static int dvmVerifyNone() {
        int i = -1;
        if (ensureInited()) {
            try {
                i = dvmVerifyNoneNative();
                return i;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return i;
    }

    public static int verifyEnable() {
        if (ensureInited()) {
            return verifyEnableNative();
        }
        return -1;
    }

    public static int verifyNone(int i, int i2) {
        if (ensureInited()) {
            return verifyNoneNative(i, i2);
        }
        return -1;
    }
}

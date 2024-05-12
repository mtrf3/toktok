package com.bytedance.common.jato.shrinker;

import X.C48693J9d;

/* loaded from: classes16.dex */
public class ShrinkerNativeHolder {
    public static boolean LIZ;

    public static native int shrinkHeapNative(int i);

    public static native int shrinkMallocNative(int i, int i2);

    public static native int shrinkRegionNative(int i);

    public static synchronized boolean LIZ() {
        boolean z;
        synchronized (ShrinkerNativeHolder.class) {
            if (!LIZ && C48693J9d.LJFF()) {
                LIZ = true;
            }
            z = LIZ;
        }
        return z;
    }
}

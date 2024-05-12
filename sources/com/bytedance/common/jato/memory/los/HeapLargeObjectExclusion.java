package com.bytedance.common.jato.memory.los;

import X.C48693J9d;

/* loaded from: classes7.dex */
public class HeapLargeObjectExclusion {
    public static native long getLargeObjectAllocatedBytes();

    public static native boolean nativeExcludeLOS();

    public static native void nativeHideJavaHeapSize(long j);

    public static native boolean nativeSetLargeObjectThreshold(int i);

    static {
        C48693J9d.LJFF();
    }
}

package com.bytedance.crash.nativecrash;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class FDLeakDetector {
    public static native void doSetAddrs(long j, long j2);

    public static native void doStartDetect(String str);

    static {
        new AtomicBoolean();
    }
}

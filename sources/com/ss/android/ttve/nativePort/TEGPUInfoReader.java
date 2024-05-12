package com.ss.android.ttve.nativePort;

import X.FWO;

/* loaded from: classes7.dex */
public class TEGPUInfoReader {
    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    static {
        synchronized (FWO.class) {
            FWO.LIZJ();
        }
    }
}

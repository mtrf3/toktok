package com.bytedance.otis.resource.demo;

import com.bytedance.otis.resource.util.EnsureLoad;

/* loaded from: classes7.dex */
public final class NativeMock {
    public static final native void mockNativeUsage();

    static {
        new NativeMock();
        EnsureLoad.LIZ.init();
    }
}

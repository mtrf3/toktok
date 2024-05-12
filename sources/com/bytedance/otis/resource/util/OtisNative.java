package com.bytedance.otis.resource.util;

/* loaded from: classes7.dex */
public final class OtisNative {
    public final native void setDebugger(boolean z);

    static {
        new OtisNative();
        EnsureLoad.LIZ.init();
    }
}

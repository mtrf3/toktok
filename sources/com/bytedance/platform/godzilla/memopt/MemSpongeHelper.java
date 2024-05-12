package com.bytedance.platform.godzilla.memopt;

import X.C16880lQ;

/* loaded from: classes7.dex */
public final class MemSpongeHelper {
    public static native void debug(boolean z);

    public static native void setHideLargeObjectMaxBytes(long j);

    public static native int start(int i, long j);

    public static native int startWhenOOM(int i, long j);

    public static native void stop();

    static {
        C16880lQ.LLJJJIL("godzilla-memsponge");
    }
}

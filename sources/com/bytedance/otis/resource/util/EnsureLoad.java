package com.bytedance.otis.resource.util;

import X.C16880lQ;

/* loaded from: classes7.dex */
public final class EnsureLoad {
    public static final EnsureLoad LIZ = new EnsureLoad();
    public static final boolean LIZIZ;

    public final void init() {
    }

    static {
        try {
            C16880lQ.LLJJJIL("resource_monitor");
            LIZIZ = true;
        } catch (Throwable unused) {
        }
    }
}

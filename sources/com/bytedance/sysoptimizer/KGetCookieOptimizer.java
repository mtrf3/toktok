package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes16.dex */
public class KGetCookieOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (KGetCookieOptimizer.class) {
            if (sOptimized) {
            }
        }
    }
}

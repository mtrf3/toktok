package com.bytedance.sysoptimizer;

import android.app.Activity;

/* loaded from: classes8.dex */
public class EnterTransitionLancet {
    public void onStop() {
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                ((Activity) new Object()).getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }
}

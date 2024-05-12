package com.lynx.tasm.core;

import X.C16880lQ;
import X.ChoreographerFrameCallbackC79464VGq;
import X.ChoreographerFrameCallbackC79465VGr;
import android.view.Choreographer;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VSyncMonitor {
    public static WeakReference<WindowManager> LIZ;
    public static Choreographer LIZIZ;

    public static native void nativeOnVSync(long j, long j2, long j3);

    public static void request(long j) {
        C16880lQ.LLIIIJ().postFrameCallback(new ChoreographerFrameCallbackC79464VGq(j));
    }

    public static void requestOnUIThread(long j) {
        LIZIZ.postFrameCallback(new ChoreographerFrameCallbackC79465VGr(j));
    }

    public static void LIZ(long j, long j2) {
        long j3;
        if (LIZ.get() != null) {
            j3 = (long) (1.0E9d / LIZ.get().getDefaultDisplay().getRefreshRate());
        } else {
            j3 = 16666666;
        }
        nativeOnVSync(j, j2, j2 + j3);
    }
}

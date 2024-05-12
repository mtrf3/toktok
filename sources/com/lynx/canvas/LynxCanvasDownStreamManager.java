package com.lynx.canvas;

import X.C16880lQ;
import android.os.Looper;
import android.view.Surface;

/* loaded from: classes2.dex */
public class LynxCanvasDownStreamManager {
    public static native long nativeAddSurface(long j, String str, Surface surface);

    public static native void nativeRemoveSurface(long j, String str, long j2);

    public LynxCanvasDownStreamManager() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
        } else {
            throw new IllegalStateException("CanvasDownStreamSurfaceManager should be used on main thread only.");
        }
    }
}

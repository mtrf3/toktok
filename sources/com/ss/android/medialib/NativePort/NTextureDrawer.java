package com.ss.android.medialib.NativePort;

import X.C16880lQ;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* loaded from: classes7.dex */
public class NTextureDrawer {
    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSetDebug(long j, boolean z);

    private native void nativeSetFlipScale(long j, float f, float f2);

    private native void nativeSetRotation(long j, float f);

    private native void nativeSetWidthHeight(long j, int i, int i2);

    static {
        C16880lQ.LJLLJ(NTextureDrawer.class);
        TENativeLibsLoader.loadRecorder();
    }
}

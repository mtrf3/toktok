package com.facebook.animated.gif;

import X.WAP;
import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public class GifFrame implements WAP {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final int LIZ() {
        return nativeGetDisposalMode();
    }

    @Override // X.WAP
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.WAP
    public final int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.WAP
    public final int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.WAP
    public final int getYOffset() {
        return nativeGetYOffset();
    }

    @Override // X.WAP
    public final void dispose() {
        nativeDispose();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.WAP
    public final void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}

package com.bytedance.fresco.animatedheif;

import X.WAP;
import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public class HeifFrame implements WAP {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    @Override // X.WAP
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.WAP
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.WAP
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.WAP
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }

    @Override // X.WAP
    public void dispose() {
        nativeDispose();
    }

    public HeifFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.WAP
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}

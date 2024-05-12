package com.byted.cast.sdk.gl.grafika;

/* loaded from: classes29.dex */
public class OffscreenSurface extends EglSurfaceBase {
    public void release() {
        releaseEglSurface();
    }

    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        createOffscreenSurface(i, i2);
    }
}

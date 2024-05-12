package com.byted.cast.capture.surface.gles;

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

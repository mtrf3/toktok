package com.bytedance.realx.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;

/* loaded from: classes33.dex */
public interface EglBase {
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    /* loaded from: classes33.dex */
    public interface Context {
        EGLContext getEgl14Context();

        long getNativeEglContext();
    }

    /* loaded from: classes33.dex */
    public interface EglContextChecker {
        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    /* loaded from: classes33.dex */
    public static class EglLock {
        public static boolean enableEglLock = true;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);
}

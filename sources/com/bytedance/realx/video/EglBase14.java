package com.bytedance.realx.video;

import X.X1D;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.bytedance.realx.video.EglBase;

/* loaded from: classes33.dex */
public class EglBase14 implements EglBase {
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    public static int egl14ContextCount;
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    /* loaded from: classes33.dex */
    public static class Context implements EglBase.Context {
        public final EGLContext egl14Context;

        @Override // com.bytedance.realx.video.EglBase.Context
        public long getNativeEglContext() {
            if (EglBase14.CURRENT_SDK_VERSION >= 21) {
                return this.egl14Context.getNativeHandle();
            }
            return this.egl14Context.getHandle();
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public EGLContext getEgl14Context() {
            return this.egl14Context;
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to initialize EGL14: 0x");
            LIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Unable to get EGL14 display: 0x");
        LIZ2.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(X1D.LIZIZ(LIZ2));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay != EGL14.EGL_NO_DISPLAY && this.eglContext != EGL14.EGL_NO_CONTEXT && this.eglConfig != null) {
        } else {
            throw new RuntimeException("This object has been released");
        }
    }

    private void eglDetachCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eglDetachCurrent failed: 0x");
        LIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    private void eglMakeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eglMakeCurrent failed: 0x");
        LIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void detachCurrent() {
        if (EglBase.EglLock.enableEglLock) {
            synchronized (EglBase.lock) {
                eglDetachCurrent();
            }
            return;
        }
        eglDetachCurrent();
    }

    @Override // com.bytedance.realx.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // com.bytedance.realx.video.EglBase
    public boolean hasSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public static boolean isEGL14Supported() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SDK version: ");
        int i = CURRENT_SDK_VERSION;
        LIZ.append(i);
        LIZ.append(". isEGL14Supported: ");
        if (i >= 18) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (i >= 18) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            if (EglBase.EglLock.enableEglLock) {
                synchronized (EglBase.lock) {
                    eglMakeCurrent();
                }
                return;
            }
            eglMakeCurrent();
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // com.bytedance.realx.video.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EglBaseCheckerHelper.EglContextDestoryStart();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBaseCheckerHelper.EglContextDestoryEnd();
        if (!GlReleaseThreadByPass.isEglReleaseThreadByPass()) {
            EGL14.eglReleaseThread();
        }
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl14ContextCount--;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (EglBase.EglLock.enableEglLock) {
                synchronized (EglBase.lock) {
                    EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                }
                return;
            }
            EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to create window surface: 0x");
                LIZ.append(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (EglBase.EglLock.enableEglLock) {
                synchronized (EglBase.lock) {
                    EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
                    EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                }
                return;
            }
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    public EglBase14(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                throw new RuntimeException("eglChooseConfig returned null");
            }
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eglChooseConfig failed: 0x");
        LIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to create pixel buffer surface with size ");
            LIZ.append(i);
            LIZ.append("x");
            LIZ.append(i2);
            LIZ.append(": 0x");
            LIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        if (context == null || context.egl14Context != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {12440, 2, 12344};
            if (context == null || (eGLContext = context.egl14Context) == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                egl14ContextCount++;
                return eglCreateContext;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to create EGL context: 0x");
            LIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
        throw new RuntimeException("Invalid sharedContext");
    }
}

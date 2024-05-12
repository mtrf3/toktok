package com.byted.cast.sdk.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* loaded from: classes29.dex */
public class EGlSurface {
    public int height;
    public Surface surface;
    public int width;
    public EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
    public EGLContext eglContext = EGL14.EGL_NO_CONTEXT;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    public EGLConfig[] configs = new EGLConfig[1];

    private void createEGLSurface() {
        this.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.configs[0], this.surface, new int[]{12344}, 0);
        GlUtils.checkEglError("eglCreateWindowSurface");
    }

    private void eglSetup() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.eglDisplay = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLConfig[] eGLConfigArr = this.configs;
                if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, this.configs[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    GlUtils.checkEglError("eglCreateContext");
                    createEGLSurface();
                    this.width = getWidth();
                    this.height = getHeight();
                    return;
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public int getHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int getWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public void makeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void makeUnCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void release() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.eglSurface);
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
        }
        this.surface.release();
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglSurface = EGL14.EGL_NO_SURFACE;
    }

    public boolean swapBuffers() {
        return EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
    }

    public EGlSurface(Surface surface) {
        this.surface = surface;
        eglSetup();
    }

    public void setPresentationTime(long j) {
        EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
    }
}

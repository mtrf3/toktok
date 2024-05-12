package com.bef.effectsdk;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public class GLTextureView$DefaultWindowSurfaceFactory implements GLTextureView$EGLWindowSurfaceFactory {
    public GLTextureView$DefaultWindowSurfaceFactory() {
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLWindowSurfaceFactory
    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLWindowSurfaceFactory
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

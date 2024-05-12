package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC05030Hr;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes.dex */
public class GLTextureView$DefaultContextFactory implements GLTextureView$EGLContextFactory {
    public int EGL_CONTEXT_CLIENT_VERSION;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC05030Hr this$0;

    public GLTextureView$DefaultContextFactory(TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr) {
        this.this$0 = textureViewSurfaceTextureListenerC05030Hr;
        this.EGL_CONTEXT_CLIENT_VERSION = 12440;
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 3, 12344});
        this.this$0.mEGLContextClientVersion = 3;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        if (eglCreateContext == eGLContext) {
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.this$0;
            textureViewSurfaceTextureListenerC05030Hr.mEGLContextClientVersion = 2;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                textureViewSurfaceTextureListenerC05030Hr.mEGLContextClientVersion = 0;
            }
        }
        return eglCreateContext;
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            GLTextureView$EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }
}

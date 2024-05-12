package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC05030Hr;
import android.opengl.GLDebugHelper;
import defpackage.i0;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

/* loaded from: classes.dex */
public class GLTextureView$EglHelper {
    public EGL10 mEgl;
    public EGLConfig mEglConfig;
    public EGLContext mEglContext;
    public EGLDisplay mEglDisplay;
    public EGLSurface mEglSurface;
    public WeakReference<TextureViewSurfaceTextureListenerC05030Hr> mGLTextureViewWeakRef;

    public static void logEglErrorAsWarning(String str, String str2, int i) {
    }

    private void destroySurfaceImp() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.mEglSurface;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.mGLTextureViewWeakRef.get();
            if (textureViewSurfaceTextureListenerC05030Hr != null) {
                textureViewSurfaceTextureListenerC05030Hr.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }
    }

    public GL createGL() {
        int i;
        Writer writer;
        GL gl = this.mEglContext.getGL();
        TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.mGLTextureViewWeakRef.get();
        if (textureViewSurfaceTextureListenerC05030Hr != null) {
            GLTextureView$GLWrapper gLTextureView$GLWrapper = textureViewSurfaceTextureListenerC05030Hr.mGLWrapper;
            if (gLTextureView$GLWrapper != null) {
                gl = gLTextureView$GLWrapper.wrap(gl);
            }
            int i2 = textureViewSurfaceTextureListenerC05030Hr.mDebugFlags;
            if ((i2 & 3) != 0) {
                if ((i2 & 1) != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    writer = new Writer() { // from class: com.bef.effectsdk.GLTextureView$LogWriter
                        public StringBuilder mBuilder = new StringBuilder();

                        private void flushBuilder() {
                            if (this.mBuilder.length() > 0) {
                                StringBuilder sb = this.mBuilder;
                                sb.delete(0, sb.length());
                            }
                        }

                        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            flushBuilder();
                        }

                        @Override // java.io.Writer, java.io.Flushable
                        public void flush() {
                            flushBuilder();
                        }

                        @Override // java.io.Writer
                        public void write(char[] cArr, int i3, int i4) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                char c = cArr[i3 + i5];
                                if (c == '\n') {
                                    flushBuilder();
                                } else {
                                    this.mBuilder.append(c);
                                }
                            }
                        }
                    };
                } else {
                    writer = null;
                }
                return GLDebugHelper.wrap(gl, i, writer);
            }
            return gl;
        }
        return gl;
    }

    public boolean createSurface() {
        if (this.mEgl != null) {
            if (this.mEglDisplay != null) {
                if (this.mEglConfig != null) {
                    destroySurfaceImp();
                    TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.mGLTextureViewWeakRef.get();
                    if (textureViewSurfaceTextureListenerC05030Hr != null) {
                        this.mEglSurface = textureViewSurfaceTextureListenerC05030Hr.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, textureViewSurfaceTextureListenerC05030Hr.getSurfaceTexture());
                    } else {
                        this.mEglSurface = null;
                    }
                    EGLSurface eGLSurface = this.mEglSurface;
                    if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                        this.mEgl.eglGetError();
                        return false;
                    }
                    if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
                        logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                        return false;
                    }
                    return true;
                }
                throw new RuntimeException("mEglConfig not initialized");
            }
            throw new RuntimeException("eglDisplay not initialized");
        }
        throw new RuntimeException("egl not initialized");
    }

    public void finish() {
        if (this.mEglContext != null) {
            TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.mGLTextureViewWeakRef.get();
            if (textureViewSurfaceTextureListenerC05030Hr != null) {
                textureViewSurfaceTextureListenerC05030Hr.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
            }
            this.mEglContext = null;
        }
        EGLDisplay eGLDisplay = this.mEglDisplay;
        if (eGLDisplay != null) {
            this.mEgl.eglTerminate(eGLDisplay);
            this.mEglDisplay = null;
        }
    }

    public int swap() {
        if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            return this.mEgl.eglGetError();
        }
        return 12288;
    }

    public void start() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEgl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEglDisplay = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.mEgl.eglInitialize(eglGetDisplay, new int[2])) {
                TextureViewSurfaceTextureListenerC05030Hr textureViewSurfaceTextureListenerC05030Hr = this.mGLTextureViewWeakRef.get();
                if (textureViewSurfaceTextureListenerC05030Hr == null) {
                    this.mEglConfig = null;
                    this.mEglContext = null;
                } else {
                    EGLConfig chooseConfig = textureViewSurfaceTextureListenerC05030Hr.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                    this.mEglConfig = chooseConfig;
                    this.mEglContext = textureViewSurfaceTextureListenerC05030Hr.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, chooseConfig);
                }
                EGLContext eGLContext = this.mEglContext;
                if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                    this.mEglContext = null;
                    throwEglException("createContext");
                }
                this.mEglSurface = null;
                return;
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }

    public void destroySurface() {
        destroySurfaceImp();
    }

    public GLTextureView$EglHelper(WeakReference<TextureViewSurfaceTextureListenerC05030Hr> weakReference) {
        this.mGLTextureViewWeakRef = weakReference;
    }

    private void throwEglException(String str) {
        throwEglException(str, this.mEgl.eglGetError());
    }

    public static String formatEglError(String str, int i) {
        return i0.LJFF(str, " failed");
    }

    public static void throwEglException(String str, int i) {
        throw new RuntimeException(formatEglError(str, i));
    }
}

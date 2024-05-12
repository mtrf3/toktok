package com.ss.android.ugc.effectmanager.common.utils;

import X.X1D;
import android.os.Build;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class EGLUtils {
    public static final Companion Companion = new Companion();
    public EGL10 egl;
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface;
    public GL10 gl10;
    public final boolean isMiPlay;
    public final EGLContext shareContext = EGL10.EGL_NO_CONTEXT;

    public final void destroy() {
        EGLSurface eGLSurface;
        EGL10 egl10 = this.egl;
        if (egl10 != null) {
            if (!this.isMiPlay) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
                egl10.eglTerminate(this.eglDisplay);
                return;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != EGL10.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface3 = this.eglSurface;
                if (eGLSurface3 != null && eGLSurface3 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                    egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                    this.eglSurface = null;
                }
                EGLContext eGLContext = this.eglContext;
                if (eGLContext != null) {
                    egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                    this.eglContext = null;
                }
                EGLDisplay eGLDisplay3 = this.eglDisplay;
                if (eGLDisplay3 != null) {
                    egl10.eglTerminate(eGLDisplay3);
                    this.eglDisplay = null;
                }
            }
        }
    }

    public EGLUtils() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            o.LJFF(str, "(this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        this.isMiPlay = o.LJ("mi play", str);
    }

    public final GL10 getGl10() {
        return this.gl10;
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void checkError(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EGL error: 0x");
            LIZ.append(Integer.toHexString(eglGetError));
            logOrThrowException(X1D.LIZIZ(LIZ));
        }
    }

    private final void logOrThrowException(String str) {
        if (!this.isMiPlay) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get gpu info error:");
            LIZ.append(str);
            EPLog.e("EGLUtils", X1D.LIZIZ(LIZ));
            return;
        }
        throw new RuntimeException(str);
    }

    public final void eglInit(int i, int i2) {
        GL gl;
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGL egl = EGLContext.getEGL();
        GL gl2 = null;
        if (!(egl instanceof EGL10)) {
            egl = null;
        }
        EGL10 egl10 = (EGL10) egl;
        if (egl10 != null) {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                logOrThrowException("unable to get EGL10 display");
            }
            checkError(egl10);
            if (!egl10.eglInitialize(this.eglDisplay, new int[2])) {
                logOrThrowException("unable to initialize EGL10");
            }
            checkError(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.eglDisplay, iArr, null, 0, iArr2)) {
                logOrThrowException("eglChooseConfig failed");
            }
            checkError(egl10);
            int i3 = iArr2[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i3];
            if (!egl10.eglChooseConfig(this.eglDisplay, iArr, eGLConfigArr, i3, iArr2)) {
                logOrThrowException("eglChooseConfig#2 failed");
            }
            checkError(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.eglConfig = eGLConfig;
            if (eGLConfig == null) {
                logOrThrowException("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || eglCreatePbufferSurface == null) {
                logOrThrowException("surface was null");
            }
            checkError(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.shareContext, new int[]{12440, 2, 12344});
            this.eglContext = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || eglCreateContext == null) {
                logOrThrowException("context was null");
            }
            checkError(egl10);
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                logOrThrowException("eglMakeCurrent failed");
            }
            checkError(egl10);
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                gl = eGLContext.getGL();
            } else {
                gl = null;
            }
            if (gl instanceof GL10) {
                gl2 = gl;
            }
            this.gl10 = (GL10) gl2;
            this.egl = egl10;
        }
    }
}
package com.ss.bytertc.engine.utils;

import X.X1D;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;

/* loaded from: classes33.dex */
public class GLUtils {
    public static int[] defaultEGLConfAttr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static int[] ctxAttr = {12440, 2, 12344};

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

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay) {
        return getEglConfig(eGLDisplay, defaultEGLConfAttr);
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

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, ctxAttr, 0);
    }
}

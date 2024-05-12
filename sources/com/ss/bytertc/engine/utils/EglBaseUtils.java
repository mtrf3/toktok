package com.ss.bytertc.engine.utils;

import X.ZVB;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.realx.video.EglBase;

/* loaded from: classes33.dex */
public class EglBaseUtils {
    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EglBase createEGLBase(EGLContext eGLContext) {
        if (eGLContext == EGL14.EGL_NO_CONTEXT || eGLContext == null) {
            return ZVB.LJI(EglBase.CONFIG_PLAIN);
        }
        return ZVB.LJFF(eGLContext, EglBase.CONFIG_PLAIN);
    }

    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        return eglBase.getEglBaseContext();
    }

    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0L;
    }

    public static long getNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    public static void releaseEGLBase(EglBase eglBase) {
        if (eglBase != null) {
            eglBase.release();
        }
    }
}

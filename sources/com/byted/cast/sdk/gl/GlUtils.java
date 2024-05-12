package com.byted.cast.sdk.gl;

import X.X1D;
import android.opengl.EGL14;
import android.opengl.GLES20;

/* loaded from: classes29.dex */
public class GlUtils {
    public static void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(": EGL error: 0x");
        LIZ.append(Integer.toHexString(eglGetError));
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 1285) {
            if (glGetError == 0 || glGetError == 1285) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(": glError 0x");
            LIZ.append(Integer.toHexString(glGetError));
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" error: GL_OUT_OF_MEMORY");
        throw new RuntimeException(X1D.LIZIZ(LIZ2));
    }
}

package com.bytedance.bmf_mods.common;

import X.X1D;
import android.opengl.GLES20;

/* loaded from: classes34.dex */
public class GLUtils {
    public static int createFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGLError("GLUtils: createFbo");
        return iArr[0];
    }

    public static boolean checkGLError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ");
            LIZ.append(str);
            LIZ.append(" : ");
            LIZ.append(android.opengl.GLUtils.getEGLErrorString(glGetError));
            Logging.d(X1D.LIZIZ(LIZ));
            return true;
        }
        return false;
    }

    public static void deleteFbo(int i) {
        if (i > 0) {
            GLES20.glDeleteFramebuffers(1, new int[i], 0);
        }
    }

    public static void deleteTexture(int i) {
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[i], 0);
        }
    }

    public static int genTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGLError("GLUtils: glGenTextures");
        int i2 = iArr[0];
        if (i2 != 0) {
            GLES20.glBindTexture(i, i2);
            GLES20.glTexParameteri(i, 10242, 33071);
            GLES20.glTexParameteri(i, 10243, 33071);
            GLES20.glTexParameteri(i, 10241, 9729);
            GLES20.glTexParameteri(i, 10240, 9729);
        }
        return iArr[0];
    }

    public static String texTargetToString(int i) {
        if (i == 36197) {
            return "texture_oes";
        }
        if (i == 3553) {
            return "texture_2d";
        }
        return Integer.toString(i);
    }
}

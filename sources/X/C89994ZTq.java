package X;

import android.opengl.GLES20;

/* renamed from: X.ZTq, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89994ZTq {
    public static int LIZ(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                C47261Igj.LJIILL("BXGLUtils");
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }
}

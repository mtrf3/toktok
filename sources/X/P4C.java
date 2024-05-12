package X;

import android.opengl.GLES20;

/* loaded from: classes12.dex */
public final class P4C {
    public int LIZ = GLES20.glCreateProgram();
    public P4B LIZIZ;
    public P4B LIZJ;

    public final void LIZ() {
        GLES20.glUseProgram(this.LIZ);
    }

    public final boolean LIZIZ(String str, String str2) {
        int i;
        int i2;
        int i3 = this.LIZ;
        if (i3 == 0) {
            i3 = GLES20.glCreateProgram();
        }
        P4B p4b = this.LIZIZ;
        if (p4b != null && (i2 = p4b.LIZ) != 0) {
            GLES20.glDeleteShader(i2);
            p4b.LIZ = 0;
        }
        P4B p4b2 = this.LIZJ;
        if (p4b2 != null && (i = p4b2.LIZ) != 0) {
            GLES20.glDeleteShader(i);
            p4b2.LIZ = 0;
        }
        this.LIZIZ = new P4B(str, 35633);
        this.LIZJ = new P4B(str2, 35632);
        GLES20.glAttachShader(i3, this.LIZIZ.LIZ);
        GLES20.glAttachShader(i3, this.LIZJ.LIZ);
        int glGetError = GLES20.glGetError();
        int i4 = 0;
        while (glGetError != 0) {
            glGetError = GLES20.glGetError();
            i4++;
            if (i4 >= 32) {
                break;
            }
        }
        GLES20.glLinkProgram(i3);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i3, 35714, iArr, 0);
        P4B p4b3 = this.LIZIZ;
        int i5 = p4b3.LIZ;
        if (i5 != 0) {
            GLES20.glDeleteShader(i5);
            p4b3.LIZ = 0;
        }
        P4B p4b4 = this.LIZJ;
        int i6 = p4b4.LIZ;
        if (i6 != 0) {
            GLES20.glDeleteShader(i6);
            p4b4.LIZ = 0;
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i3);
            return false;
        }
        int i7 = this.LIZ;
        if (i7 != i3 && i7 != 0) {
            GLES20.glDeleteProgram(i7);
        }
        this.LIZ = i3;
        return true;
    }
}

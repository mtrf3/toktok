package X;

import android.opengl.GLES20;

/* loaded from: classes12.dex */
public class P4B {
    public int LIZ;

    public P4B(String str, int i) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Q7K.LJ("before glCreateShader, glError: ", glGetError, "TEProgramObject");
        }
        int glCreateShader = GLES20.glCreateShader(i);
        int glGetError2 = GLES20.glGetError();
        if (glGetError2 != 0) {
            Q7K.LJ("after glCreateShader, glError: ", glGetError2, "TEProgramObject");
        }
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int glGetError3 = GLES20.glGetError();
            if (glGetError3 != 0) {
                Q7K.LJ("after glCompileShader, glError: ", glGetError3, "TEProgramObject");
            }
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                P4Q.LIZJ("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        this.LIZ = glCreateShader;
        if (glCreateShader == 0) {
            P4Q.LIZJ("TEProgramObject", "glCreateShader Failed!...");
        }
    }
}

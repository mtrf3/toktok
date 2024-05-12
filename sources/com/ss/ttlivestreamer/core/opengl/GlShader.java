package com.ss.ttlivestreamer.core.opengl;

import X.C7MY;
import X.X1D;
import android.opengl.GLES20;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.a1;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public class GlShader {
    public int program;

    public void release() {
        AVLog.d("GlShader", "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void useProgram() {
        int i = this.program;
        if (i != -1) {
            GLES20.glUseProgram(i);
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            throw new RuntimeException(a1.LJ("Could not locate '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException(a1.LJ("Could not locate uniform '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Could not link program: ");
                LIZ.append(GLES20.glGetProgramInfoLog(this.program));
                AVLog.e("GlShader", X1D.LIZIZ(LIZ));
                throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("glCreateProgram() failed. GLES20 error: ");
        LIZ2.append(GLES20.glGetError());
        throw new RuntimeException(X1D.LIZIZ(LIZ2));
    }

    public static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return glCreateShader;
            }
            StringBuilder LJ = C7MY.LJ("Could not compile shader ", i, ":");
            LJ.append(GLES20.glGetShaderInfoLog(glCreateShader));
            AVLog.e("GlShader", X1D.LIZIZ(LJ));
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("glCreateShader() failed. GLES20 error: ");
        LIZ.append(GLES20.glGetError());
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}

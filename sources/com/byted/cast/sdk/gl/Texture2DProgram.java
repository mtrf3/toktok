package com.byted.cast.sdk.gl;

import X.X1D;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes29.dex */
public class Texture2DProgram {
    public int aPositionLoc;
    public int aTextureCoordLoc;
    public int programHandle;
    public int uMVPMatrixLoc;
    public int uTexMatrixLoc;

    public int createTextureObject() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, iArr[0]);
        GlUtils.checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GlUtils.checkGlError("glTexParameter");
        return iArr[0];
    }

    public void release() {
        GLES20.glDeleteProgram(this.programHandle);
    }

    public Texture2DProgram() {
        int createProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.programHandle = createProgram;
        if (createProgram != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(createProgram, "aPosition");
            this.aPositionLoc = glGetAttribLocation;
            checkLocation(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.programHandle, "aTextureCoord");
            this.aTextureCoordLoc = glGetAttribLocation2;
            checkLocation(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
            this.uMVPMatrixLoc = glGetUniformLocation;
            checkLocation(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.programHandle, "uTexMatrix");
            this.uTexMatrixLoc = glGetUniformLocation2;
            checkLocation(glGetUniformLocation2, "uTexMatrix");
            return;
        }
        throw new RuntimeException("Unable to create program");
    }

    private void checkLocation(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unable to locate '");
        LIZ.append(str);
        LIZ.append("' in program");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    private int createProgram(String str, String str2) {
        int loadShader;
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GlUtils.checkGlError("glCreateProgram");
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, loadShader2);
            GlUtils.checkGlError("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, loadShader);
            GlUtils.checkGlError("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Could not link program: ");
            LIZ.append(glGetProgramInfoLog);
            throw new Exception(X1D.LIZIZ(LIZ));
        }
        throw new Exception("Could not create program");
    }

    private int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("glCreateShader type=");
        LIZ.append(i);
        GlUtils.checkGlError(X1D.LIZIZ(LIZ));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Could not compile shader ");
        LIZ2.append(i);
        LIZ2.append(": ");
        LIZ2.append(glGetShaderInfoLog);
        throw new Exception(X1D.LIZIZ(LIZ2));
    }

    public void draw(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6) {
        GlUtils.checkGlError("draw start");
        GLES20.glUseProgram(this.programHandle);
        GlUtils.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i5);
        GLES20.glUniformMatrix4fv(this.uMVPMatrixLoc, 1, false, fArr, 0);
        GlUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.uTexMatrixLoc, 1, false, fArr2, 0);
        GlUtils.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.aPositionLoc);
        GlUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.aPositionLoc, i3, 5126, false, i4, (Buffer) floatBuffer);
        GlUtils.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.aTextureCoordLoc);
        GlUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.aTextureCoordLoc, 2, 5126, false, i6, (Buffer) floatBuffer2);
        GlUtils.checkGlError("glVertexAttribPointer");
        GLES20.glDrawArrays(5, i, i2);
        GlUtils.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.aPositionLoc);
        GLES20.glDisableVertexAttribArray(this.aTextureCoordLoc);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }
}

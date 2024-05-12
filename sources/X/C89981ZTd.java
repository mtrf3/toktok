package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.ZTd, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public class C89981ZTd {
    public final FloatBuffer LIZ;
    public final float[] LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIZ;
    public final float[] LIZIZ = new float[16];
    public final int[] LJIIIIZZ = new int[1];

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r7 = this;
            r1 = 35633(0x8b31, float:4.9932E-41)
            java.lang.String r0 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            int r6 = LIZIZ(r1, r0)
            r4 = 1
            r3 = 0
            if (r6 != 0) goto L68
        Ld:
            r5 = 0
        Le:
            r7.LIZLLL = r5
            if (r5 == 0) goto Lcf
            java.lang.String r0 = "aPosition"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r5, r0)
            r7.LJI = r0
            java.lang.String r0 = "glGetAttribLocation aPosition"
            LIZ(r0)
            int r0 = r7.LJI
            r2 = -1
            if (r0 == r2) goto Lc7
            int r1 = r7.LIZLLL
            java.lang.String r0 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r1, r0)
            r7.LJII = r0
            java.lang.String r0 = "glGetAttribLocation aTextureCoord"
            LIZ(r0)
            int r0 = r7.LJII
            if (r0 == r2) goto Lbf
            int r1 = r7.LIZLLL
            java.lang.String r0 = "uMVPMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r1, r0)
            r7.LJ = r0
            java.lang.String r0 = "glGetUniformLocation uMVPMatrix"
            LIZ(r0)
            int r0 = r7.LJ
            if (r0 == r2) goto Lb7
            int r1 = r7.LIZLLL
            java.lang.String r0 = "uSTMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r1, r0)
            r7.LJFF = r0
            java.lang.String r0 = "glGetUniformLocation uSTMatrix"
            LIZ(r0)
            int r0 = r7.LJFF
            if (r0 == r2) goto Laf
            int[] r0 = r7.LJIIIIZZ
            android.opengl.GLES20.glGenFramebuffers(r4, r0, r3)
            java.lang.String r0 = "glGenFramebuffers"
            LIZ(r0)
            return
        L68:
            r1 = 35632(0x8b30, float:4.9931E-41)
            java.lang.String r0 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            int r1 = LIZIZ(r1, r0)
            if (r1 != 0) goto L74
            goto Ld
        L74:
            int r5 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r0 = "glCreateProgram"
            LIZ(r0)
            java.lang.String r2 = "BXHwDecoder"
            if (r5 != 0) goto L84
            X.C47261Igj.LJIILL(r2)
        L84:
            android.opengl.GLES20.glAttachShader(r5, r6)
            java.lang.String r0 = "glAttachShader"
            LIZ(r0)
            android.opengl.GLES20.glAttachShader(r5, r1)
            LIZ(r0)
            android.opengl.GLES20.glLinkProgram(r5)
            int[] r1 = new int[r4]
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r5, r0, r1, r3)
            r0 = r1[r3]
            if (r0 == r4) goto Le
            X.C47261Igj.LJIILL(r2)
            android.opengl.GLES20.glGetProgramInfoLog(r5)
            X.C47261Igj.LJIILL(r2)
            android.opengl.GLES20.glDeleteProgram(r5)
            goto Ld
        Laf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for uSTMatrix"
            r1.<init>(r0)
            throw r1
        Lb7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for uMVPMatrix"
            r1.<init>(r0)
            throw r1
        Lbf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for aTextureCoord"
            r1.<init>(r0)
            throw r1
        Lc7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for aPosition"
            r1.<init>(r0)
            throw r1
        Lcf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "failed creating program"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89981ZTd.LIZJ():void");
    }

    public C89981ZTd(SurfaceTexture surfaceTexture) {
        float[] fArr = new float[16];
        this.LIZJ = fArr;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.LIZ = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public static void LIZ(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(": glError ");
                LIZ.append(glGetError);
                X1D.LIZIZ(LIZ);
                C47261Igj.LJIILL("BXHwDecoder");
            } else {
                return;
            }
        }
    }

    public static int LIZIZ(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("glCreateShader type=");
        LIZ.append(i);
        LIZ(X1D.LIZIZ(LIZ));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Could not compile shader ");
            LIZ2.append(i);
            LIZ2.append(":");
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJIILL("BXHwDecoder");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" ");
            LIZ3.append(GLES20.glGetShaderInfoLog(glCreateShader));
            X1D.LIZIZ(LIZ3);
            C47261Igj.LJIILL("BXHwDecoder");
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }
}

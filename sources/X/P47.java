package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.ss.android.vesdk.VEConfigCenter;
import defpackage.i0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public class P47 {
    public final float[] LIZ;
    public final FloatBuffer LIZIZ;
    public final float[] LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIL;
    public final float[] LIZJ = new float[16];
    public final int[] LJIIJJI = new int[1];
    public P48 LJIILIIL = P48.UNKNOWN;
    public int LJIILJJIL = 2;

    public P47(SurfaceTexture surfaceTexture) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.LIZ = fArr;
        float[] fArr2 = new float[16];
        this.LIZLLL = fArr2;
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(fArr.length * 4));
        this.LIZIZ = LJI;
        LJI.put(fArr);
        LJI.position(0);
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr2);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
    }

    public static int LIZ(String str) {
        int LIZJ;
        int LIZJ2 = LIZJ(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (LIZJ2 == 0 || (LIZJ = LIZJ(35632, str)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            P4Q.LIZJ("TEMediaCodecDecoder", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, LIZJ2);
        GLES20.glAttachShader(glCreateProgram, LIZJ);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Could not link program: ");
            LIZ.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    public static int LIZJ(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Could not compile shader ");
            LIZ.append(i);
            LIZ.append(":");
            P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" ");
            LIZ2.append(GLES20.glGetShaderInfoLog(glCreateShader));
            P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ2));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        float f2;
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            Matrix.setIdentityM(this.LIZJ, 0);
            return;
        }
        int i6 = this.LJIIL;
        this.LJIIL = i;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, 1.0f);
        if (z) {
            Matrix.rotateM(fArr, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        }
        if (Math.abs(i) == 90 || Math.abs(i) == 270) {
            f = i3;
        } else {
            f = i2;
        }
        if (Math.abs(i) == 90 || Math.abs(i) == 270) {
            f2 = i2;
        } else {
            f2 = i3;
        }
        float f3 = i4;
        float f4 = f3 / f;
        float f5 = i5;
        float f6 = f5 / f2;
        if (f4 <= f6) {
            f4 = f6;
        }
        Matrix.scaleM(fArr, 0, (i2 / 2.0f) * f4, (i3 / 2.0f) * f4, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.orthoM(fArr3, 0, (-i4) / 2.0f, f3 / 2.0f, (-i5) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr, 0);
        Matrix.setIdentityM(this.LIZJ, 0);
        Matrix.multiplyMM(this.LIZJ, 0, fArr3, 0, fArr4, 0);
    }

    public final void LJ(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i <= 0 || i2 <= 0 || i4 < i3 || i6 < i5 || i6 > i || i4 > i2) {
            return;
        }
        float[] fArr = this.LIZ;
        float f = i;
        float f2 = (i5 * 1.0f) / f;
        fArr[3] = f2;
        float f3 = i2;
        float f4 = (i3 * 1.0f) / f3;
        fArr[4] = f4;
        float f5 = (i6 * 1.0f) / f;
        fArr[8] = f5;
        fArr[9] = f4;
        fArr[13] = f2;
        float f6 = (i4 * 1.0f) / f3;
        fArr[14] = f6;
        fArr[18] = f5;
        fArr[19] = f6;
        this.LIZIZ.clear();
        FloatBuffer floatBuffer = this.LIZIZ;
        floatBuffer.put(this.LIZ);
        floatBuffer.position(0);
    }

    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        P48 p48;
        P48 p482;
        int i8;
        float f;
        GLES20.glViewport(0, 0, i3, i4);
        if (VEConfigCenter.getInstance().getValue("veabtest_mediacodec_fix_powervr", false).booleanValue()) {
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
        P47 p47 = this;
        GLES20.glBindFramebuffer(36160, p47.LJIIJJI[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i6, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(p47.LJ);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i5);
        if (Math.min(i, i2) >= Math.min(i3, i4) * 2) {
            z = true;
        } else {
            z = false;
        }
        if (C65429Pm5.LJFF("ve_enable_preview_sharpness_opt", false) || 2 == (VEConfigCenter.getInstance().getValue("ve_enable_odd_display", 0) & 2)) {
            int i9 = i * i2;
            int i10 = i3 * i4;
            if (i9 == i10 && ((p482 = p47.LJIILIIL) == P48.UNKNOWN || p482 == P48.LINEAR)) {
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                p47.LJIILIIL = P48.NEAREST;
            } else if (i9 != i10 && ((p48 = p47.LJIILIIL) == P48.UNKNOWN || p48 == P48.NEAREST)) {
                if (C65429Pm5.LJFF("ve_enable_opt_hwdecode_moire", false) && p47.LJIILJJIL >= 3) {
                    if (z) {
                        P48 p483 = p47.LJIILIIL;
                        P48 p484 = P48.NEAREST;
                        if (p483 != p484) {
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            p47.LJIILIIL = p484;
                        }
                    }
                } else {
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    p47.LJIILIIL = P48.LINEAR;
                }
            }
        } else if (C65429Pm5.LJFF("ve_enable_opt_hwdecode_moire", false) && p47.LJIILJJIL >= 3 && z) {
            P48 p485 = p47.LJIILIIL;
            P48 p486 = P48.NEAREST;
            if (p485 != p486) {
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                p47.LJIILIIL = p486;
            }
        }
        p47.LIZIZ.position(0);
        GLES20.glVertexAttribPointer(p47.LJII, 3, 5126, false, 20, (Buffer) p47.LIZIZ);
        GLES20.glEnableVertexAttribArray(p47.LJII);
        p47.LIZIZ.position(3);
        GLES20.glVertexAttribPointer(p47.LJIIIIZZ, 2, 5126, false, 20, (Buffer) p47.LIZIZ);
        GLES20.glEnableVertexAttribArray(p47.LJIIIIZZ);
        int i11 = i7;
        if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_support_rotate", false).booleanValue()) {
            if (C65429Pm5.LJFF("ve_enable_hw_decoder_use_surfacetexture_matrix", false)) {
                i8 = 1;
                f = 1.0f;
                p47.LIZLLL(i11, i, i2, i3, i4, true);
            } else {
                i8 = 1;
                f = 1.0f;
                p47 = p47;
                i11 = i11;
                p47.LIZLLL(i11, i, i2, i3, i4, false);
            }
        } else {
            i8 = 1;
            f = 1.0f;
            Matrix.setIdentityM(p47.LIZJ, 0);
        }
        GLES20.glUniformMatrix4fv(p47.LJFF, i8, false, p47.LIZJ, 0);
        GLES20.glUniformMatrix4fv(p47.LJI, i8, false, p47.LIZLLL, 0);
        if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() && p47.LJIILJJIL >= 3) {
            float f2 = i * f;
            float f3 = i3;
            float f4 = f2 / f3;
            float f5 = i2 * f;
            float f6 = i4;
            float f7 = f5 / f6;
            if (C65429Pm5.LJFF("ve_enable_hw_decoder_support_rotate", false) && (Math.abs(i11) == 90 || Math.abs(i11) == 270)) {
                f4 = f2 / f6;
                f7 = f5 / f3;
            }
            GLES20.glUniform2f(p47.LJIIJ, f4, f7);
            GLES20.glUniform2f(p47.LJIIIZ, f2, f5);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(p47.LJII);
        GLES20.glDisableVertexAttribArray(p47.LJIIIIZZ);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFinish();
    }
}

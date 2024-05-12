package X;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public final class P4D {
    public static final float[] LJII = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    public static final float[] LJIIIIZZ = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    public P4C LIZ;
    public int[] LIZIZ;
    public FloatBuffer LIZJ;
    public FloatBuffer LIZLLL;
    public int LJ;
    public RectF LJFF;
    public int LJI = Integer.MAX_VALUE;

    public final void LIZJ() {
        P4C p4c = this.LIZ;
        int i = p4c.LIZ;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            p4c.LIZ = 0;
        }
        int[] iArr = this.LIZIZ;
        if (iArr != null) {
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            this.LIZIZ = null;
        }
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public static FloatBuffer LIZ(float[] fArr) {
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(fArr.length * 4));
        LJI.put(fArr, 0, fArr.length);
        LJI.position(0);
        return LJI;
    }

    public final void LIZIZ(int i) {
        this.LIZ.LIZ();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindBuffer(34962, this.LIZIZ[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.LIZIZ[1]);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void LJ(RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = this.LJFF;
            if (rectF2 != null && rectF.equals(rectF2)) {
                return;
            }
            this.LJFF = rectF;
            float[] fArr = LJIIIIZZ;
            float f = rectF.left;
            fArr[0] = f;
            float f2 = 1.0f - rectF.top;
            fArr[1] = f2;
            fArr[2] = f;
            float f3 = 1.0f - rectF.bottom;
            fArr[3] = f3;
            float f4 = rectF.right;
            fArr[4] = f4;
            fArr[5] = f2;
            fArr[6] = f4;
            fArr[7] = f3;
            this.LIZLLL = LIZ(fArr);
            this.LIZ.LIZ();
            GLES20.glBindBuffer(34962, this.LIZIZ[1]);
            this.LIZLLL.position(0);
            GLES20.glBufferSubData(34962, 0, 32, this.LIZLLL);
        }
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        float f2;
        this.LIZ.LIZ();
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.LJ, 1, false, fArr, 0);
            return;
        }
        if (this.LJI == i) {
            return;
        }
        this.LJI = i;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, i, 0.0f, 0.0f, 1.0f);
        if (z) {
            Matrix.rotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
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
        Matrix.scaleM(fArr2, 0, (i2 / 2.0f) * f4, (i3 / 2.0f) * f4, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.orthoM(fArr4, 0, (-i4) / 2.0f, f3 / 2.0f, (-i5) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr2, 0);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        GLES20.glUniformMatrix4fv(this.LJ, 1, false, fArr6, 0);
    }
}

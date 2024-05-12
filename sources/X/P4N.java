package X;

import android.opengl.GLES20;

/* loaded from: classes12.dex */
public final class P4N {
    public static final float[] LJ = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public P4C LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZJ() {
        double d = 0.0f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.LIZ.LIZ();
        GLES20.glUniformMatrix2fv(this.LIZJ, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void LIZIZ() {
        P4C p4c = this.LIZ;
        if (p4c != null) {
            int i = p4c.LIZ;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                p4c.LIZ = 0;
            }
            this.LIZ = null;
        }
        int i2 = this.LIZIZ;
        if (i2 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
            this.LIZIZ = 0;
        }
    }

    public final void LIZ(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.LIZIZ);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.LIZ.LIZ();
        GLES20.glDrawArrays(5, 0, 4);
    }
}

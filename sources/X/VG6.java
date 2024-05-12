package X;

import android.opengl.GLES20;

/* loaded from: classes15.dex */
public final class VG6 {
    public final int LIZ;

    public VG6() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        C78966Uyw.LJIIJ("createFbo");
        this.LIZ = iArr[0];
    }

    public static void LIZIZ() {
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void LIZ(int i) {
        GLES20.glBindFramebuffer(36160, this.LIZ);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glCheckFramebufferStatus(36160);
    }
}

package X;

import android.opengl.GLES30;

/* loaded from: classes15.dex */
public final class VGM {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i) {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        GLES30.glBindTexture(i, iArr[0]);
        GLES30.glTexParameteri(i, 10241, 9729);
        GLES30.glTexParameteri(i, 10240, 9729);
        GLES30.glTexParameteri(i, 10242, 33071);
        GLES30.glTexParameteri(i, 10243, 33071);
        return iArr[0];
    }
}

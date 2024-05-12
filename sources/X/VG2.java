package X;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VG2 implements VGE {
    public final ArrayList<VGC> LIZ = new ArrayList<>();
    public final VG0 LIZIZ;

    public final void LIZJ() {
        synchronized (this.LIZ) {
            Iterator<VGC> it = this.LIZ.iterator();
            while (it.hasNext()) {
                ((VG1) it.next()).LIZLLL();
                it.remove();
            }
        }
    }

    public VG2(VG0 vg0) {
        this.LIZIZ = vg0;
    }

    public static int LIZIZ(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        if (i2 != 0) {
            GLES20.glBindTexture(i, i2);
            GLES20.glTexParameteri(i, 10242, 33071);
            GLES20.glTexParameteri(i, 10243, 33071);
            if (i == 36197 && C56509MFt.LJIIJJI()) {
                GLES20.glTexParameteri(i, 10241, 9728);
                GLES20.glTexParameteri(i, 10240, 9728);
            } else {
                GLES20.glTexParameteri(i, 10241, 9729);
                GLES20.glTexParameteri(i, 10240, 9729);
            }
            return iArr[0];
        }
        throw new RuntimeException("Error gen texture.");
    }

    public final VGC LIZ(int i, int i2) {
        VGC vg1;
        synchronized (this.LIZ) {
            if (this.LIZ.size() > 0) {
                Iterator<VGC> it = this.LIZ.iterator();
                while (it.hasNext()) {
                    vg1 = it.next();
                    if (vg1.LIZ() == i) {
                        it.remove();
                        break;
                    }
                }
            }
            vg1 = new VG1(LIZIZ(i), i, this, i2);
        }
        vg1.LIZIZ();
        return vg1;
    }
}

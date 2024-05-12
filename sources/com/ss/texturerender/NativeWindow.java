package com.ss.texturerender;

import X.C06460Ne;
import X.C16880lQ;
import X.C48284IxE;
import X.C79062V1e;
import X.X1D;
import android.view.Surface;

/* loaded from: classes9.dex */
public class NativeWindow {
    public static final boolean LIZLLL;
    public final Surface LIZ;
    public long LIZIZ;
    public final int LIZJ;

    public static native int nativeGetHeight(long j);

    public static native int nativeGetSurfaceFormat(long j);

    public static native int nativeGetWidth(long j);

    public static native int nativeReleaseSurface(long j);

    public static native int nativeSetBuffersGeometry(long j, int i, int i2, int i3);

    public static native long nativeSetSurface(Surface surface);

    static {
        try {
            try {
                C16880lQ.LLJJJIL("texturerender_native");
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("load texturerender_native fail,error:");
                LIZ.append(e.toString());
                C48284IxE.LIZ(6, -1, "TR_NativeWindow", X1D.LIZIZ(LIZ));
            }
        } finally {
            C48284IxE.LIZ(1, -1, "TR_NativeWindow", "load texturerender_native success");
            LIZLLL = true;
        }
    }

    public final int LIZ() {
        long j = this.LIZIZ;
        if (j <= 0) {
            return -1;
        }
        return nativeGetSurfaceFormat(j);
    }

    public final void LIZIZ() {
        long j = this.LIZIZ;
        if (j <= 0) {
            return;
        }
        nativeReleaseSurface(j);
        this.LIZIZ = 0L;
    }

    public NativeWindow(int i, Surface surface) {
        if (!LIZLLL) {
            C48284IxE.LIZ(1, this.LIZJ, "TR_NativeWindow", "lib not loaded");
            return;
        }
        this.LIZ = surface;
        this.LIZIZ = nativeSetSurface(surface);
        this.LIZJ = i;
    }

    public final void LIZJ(int i, int i2, int i3) {
        if (this.LIZIZ <= 0) {
            return;
        }
        int i4 = this.LIZJ;
        StringBuilder LIZJ = C06460Ne.LIZJ("setBuffersGeometry,w:", i, ",h:", i2, ",fmt:");
        C79062V1e.LJII(LIZJ, i3, LIZJ, 1, i4, "TR_NativeWindow");
        nativeSetBuffersGeometry(this.LIZIZ, i, i2, i3);
    }
}

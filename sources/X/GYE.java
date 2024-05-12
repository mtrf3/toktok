package X;

import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GYE {
    public final String LIZ;
    public final CanvasBackground LIZIZ;
    public final StreamEditConfigure LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GYE)) {
            return false;
        }
        GYE gye = (GYE) obj;
        return o.LJ(this.LIZ, gye.LIZ) && o.LJ(this.LIZIZ, gye.LIZIZ) && o.LJ(this.LIZJ, gye.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        StreamEditConfigure streamEditConfigure = this.LIZJ;
        return hashCode + (streamEditConfigure == null ? 0 : streamEditConfigure.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasMediaInfo(downloadPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", canvasBackground=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", streamEditConfigure=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static GYE LIZ(GYE gye, CanvasBackground canvasBackground) {
        String downloadPath = gye.LIZ;
        StreamEditConfigure streamEditConfigure = gye.LIZJ;
        gye.getClass();
        o.LJIIIZ(downloadPath, "downloadPath");
        o.LJIIIZ(canvasBackground, "canvasBackground");
        return new GYE(downloadPath, canvasBackground, streamEditConfigure);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GYE(java.lang.String r5, com.ss.android.ugc.aweme.canvas.StreamEditConfigure r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            r3 = 0
            if (r0 == 0) goto L24
            X.5ij r2 = com.ss.android.ugc.aweme.canvas.CanvasBackground.Companion
            android.app.Application r0 = X.C60903NvH.LJ
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099651(0x7f060003, float:1.7811661E38)
            int r0 = r1.getColor(r0)
            r2.getClass()
            com.ss.android.ugc.aweme.canvas.CanvasBackground r1 = X.C142615ij.LIZ(r0)
        L1b:
            r0 = r7 & 4
            if (r0 == 0) goto L20
            r6 = r3
        L20:
            r4.<init>(r5, r1, r6)
            return
        L24:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GYE.<init>(java.lang.String, com.ss.android.ugc.aweme.canvas.StreamEditConfigure, int):void");
    }

    public GYE(String downloadPath, CanvasBackground canvasBackground, StreamEditConfigure streamEditConfigure) {
        o.LJIIIZ(downloadPath, "downloadPath");
        o.LJIIIZ(canvasBackground, "canvasBackground");
        this.LIZ = downloadPath;
        this.LIZIZ = canvasBackground;
        this.LIZJ = streamEditConfigure;
    }
}

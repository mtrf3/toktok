package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes12.dex */
public final class P7J {
    public P7K LIZ;
    public C63915P6p LIZIZ;

    public final Surface LIZIZ() {
        P7K p7k = this.LIZ;
        if (p7k != null) {
            return p7k.LIZJ();
        }
        return null;
    }

    public final int LIZJ() {
        P7K p7k = this.LIZ;
        if (p7k != null) {
            return p7k.LJIIJJI();
        }
        return 0;
    }

    public final SurfaceTexture LIZLLL() {
        P7K p7k = this.LIZ;
        if (p7k != null) {
            return p7k.LJI();
        }
        return null;
    }

    public final void LJ(boolean z) {
        if (this.LIZ == null) {
            C63922P6w.LIZIZ("TECameraProviderManager", "setPreviewStoppedState: prodiver is null!");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPreviewStoppedState ");
        LIZ.append(z);
        P7T.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.LJII = z;
        P7T.LIZIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (((java.util.HashMap) r0.LJIIJJI).get(java.lang.Integer.valueOf(r0.LJIIZILJ)) != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C63915P6p r4, X.X10 r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "createProvider facing = "
            r1.append(r0)
            int r0 = r5.LLLLLIL()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "TECameraProviderManager"
            X.C63922P6w.LIZLLL(r0, r1)
            int r1 = r5.LLLLLIL()
            r0 = 7
            r2 = 0
            if (r1 == r0) goto L6a
            X.P7K r0 = r3.LIZ
            if (r0 == 0) goto L2a
            r0.LJIILL()
            r3.LIZ = r2
        L2a:
            X.P6b r1 = r4.LJIIIIZZ
            X.P6b r0 = X.EnumC63901P6b.PIXEL_FORMAT_Recorder
            if (r1 != r0) goto L3e
            X.P7L r0 = new X.P7L
            r0.<init>(r4, r5)
            r3.LIZ = r0
        L37:
            r5.LLLLL(r3)
        L3a:
            r5.LLLLL(r3)
            return
        L3e:
            X.P6b r0 = X.EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES
            if (r1 != r0) goto L4a
            X.P7G r0 = new X.P7G
            r0.<init>(r4, r5)
            r3.LIZ = r0
            goto L37
        L4a:
            boolean r0 = r5 instanceof X.YQ6
            if (r0 == 0) goto L62
            int r0 = r4.LJFF
            if (r0 <= 0) goto L5a
            X.P7I r0 = new X.P7I
            r0.<init>(r4, r5)
            r3.LIZ = r0
            goto L37
        L5a:
            X.P7M r0 = new X.P7M
            r0.<init>(r4, r5)
            r3.LIZ = r0
            goto L37
        L62:
            X.P7O r0 = new X.P7O
            r0.<init>(r4, r5)
            r3.LIZ = r0
            goto L37
        L6a:
            X.P7K r1 = r3.LIZ
            if (r1 == 0) goto L77
            boolean r0 = r1 instanceof X.P7H
            if (r0 != 0) goto L77
            r1.LJIILL()
            r3.LIZ = r2
        L77:
            X.P7K r0 = r3.LIZ
            if (r0 == 0) goto L8d
            X.P7H r0 = (X.P7H) r0
            java.util.Map<java.lang.Integer, android.graphics.SurfaceTexture> r1 = r0.LJIIJJI
            int r0 = r0.LJIIZILJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L94
        L8d:
            X.P7H r0 = new X.P7H
            r0.<init>(r4, r5)
            r3.LIZ = r0
        L94:
            X.P7K r2 = r3.LIZ
            android.graphics.SurfaceTexture r1 = r4.LIZLLL
            int r0 = r4.LJ
            r2.LJIL(r1, r0)
            X.P7K r1 = r3.LIZ
            X.P7P r0 = r4.LIZJ
            r1.LJIJI(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7J.LIZ(X.P6p, X.X10):void");
    }
}

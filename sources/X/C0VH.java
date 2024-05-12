package X;

/* renamed from: X.0VH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VH {
    public static void LIZ(InterfaceC11750d9 interfaceC11750d9, C0VG c0vg) {
        boolean z = false;
        if (c0vg.LIZLLL() && c0vg.LIZ.LJFF != 3) {
            z = true;
            long j = c0vg.LIZJ;
            C10390ax LIZ = C78929UyL.LIZ(C10370av.LIZIZ, C1DF.LIZIZ((int) (j >> 32), C23490w5.LIZIZ(j)));
            interfaceC11750d9.LJIIL();
            interfaceC11750d9.LJIIJJI(LIZ, 1);
        }
        try {
            AbstractC11740d8 LIZLLL = c0vg.LIZ.LIZIZ.LIZ.LIZ.LIZLLL();
            if (LIZLLL != null) {
                C08490Uz c08490Uz = c0vg.LIZIZ;
                float LIZ2 = c0vg.LIZ.LIZIZ.LIZ.LIZ.LIZ();
                C0VD c0vd = c0vg.LIZ.LIZIZ.LIZ;
                c08490Uz.LIZ(interfaceC11750d9, LIZLLL, LIZ2, c0vd.LJIILIIL, c0vd.LJIIL);
            } else {
                C08490Uz c08490Uz2 = c0vg.LIZIZ;
                long LIZIZ = c0vg.LIZ.LIZIZ.LIZIZ();
                C0VD c0vd2 = c0vg.LIZ.LIZIZ.LIZ;
                c08490Uz2.LIZIZ(interfaceC11750d9, LIZIZ, c0vd2.LJIILIIL, c0vd2.LJIIL);
            }
        } finally {
            if (z) {
                interfaceC11750d9.LJIIJ();
            }
        }
    }
}

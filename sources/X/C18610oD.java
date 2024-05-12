package X;

/* renamed from: X.0oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18610oD {
    public static final C10390ax LIZ(InterfaceC44861pS interfaceC44861pS, int i, C14770i1 c14770i1, C0VG c0vg, boolean z, int i2) {
        C10390ax c10390ax;
        float f;
        float f2;
        if (c0vg != null) {
            c10390ax = c0vg.LIZJ(c14770i1.LIZIZ.LIZIZ(i));
        } else {
            c10390ax = C10390ax.LJ;
        }
        int LJJIJ = interfaceC44861pS.LJJIJ(C18740oQ.LIZIZ);
        if (z) {
            f = (i2 - c10390ax.LIZ) - LJJIJ;
            f2 = i2 - c10390ax.LIZ;
        } else {
            f = c10390ax.LIZ;
            f2 = LJJIJ + c10390ax.LIZ;
        }
        return new C10390ax(f, c10390ax.LIZIZ, f2, c10390ax.LIZLLL);
    }
}

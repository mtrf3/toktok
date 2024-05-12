package X;

import ujb.s;

/* renamed from: X.0qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20260qs {
    public static final /* synthetic */ C20260qs LIZ = new C20260qs();
    public static final C1YQ LIZIZ;
    public static final C1YU LIZJ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1YQ] */
    static {
        new InterfaceC20270qt() { // from class: X.1YS
            @Override // X.InterfaceC20270qt
            public final long LIZ(C0VG c0vg, long j, boolean z, C08350Ul c08350Ul) {
                return j;
            }
        };
        LIZIZ = new InterfaceC20270qt() { // from class: X.1YQ
            @Override // X.InterfaceC20270qt
            public final long LIZ(C0VG c0vg, long j, boolean z, C08350Ul c08350Ul) {
                boolean z2;
                if (C08350Ul.LIZIZ(j)) {
                    if (c08350Ul != null) {
                        z2 = C08350Ul.LJFF(c08350Ul.LIZ);
                    } else {
                        z2 = false;
                    }
                    return C78840Uwu.LJIIJJI((int) (j >> 32), s.LJJLIIIJ(c0vg.LIZ.LIZ), z, z2);
                }
                return j;
            }
        };
        LIZJ = new C1YU();
        new InterfaceC20270qt() { // from class: X.1YT
            @Override // X.InterfaceC20270qt
            public final long LIZ(C0VG c0vg, long j, boolean z, C08350Ul c08350Ul) {
                return C20260qs.LIZ(c0vg, j, new C2I8(c0vg.LIZ.LIZ));
            }
        };
        new InterfaceC20270qt() { // from class: X.1YR
            @Override // X.InterfaceC20270qt
            public final long LIZ(C0VG c0vg, long j, boolean z, C08350Ul c08350Ul) {
                int i;
                int LIZJ2;
                if (c08350Ul == null) {
                    return C20260qs.LIZJ.LIZ(c0vg, j, z, c08350Ul);
                }
                if (C08350Ul.LIZIZ(j)) {
                    return C78840Uwu.LJIIJJI((int) (j >> 32), s.LJJLIIIJ(c0vg.LIZ.LIZ), z, C08350Ul.LJFF(c08350Ul.LIZ));
                }
                if (z) {
                    i = LIZJ(c0vg, (int) (j >> 32), (int) (c08350Ul.LIZ >> 32), C08350Ul.LIZJ(j), true, C08350Ul.LJFF(j));
                    LIZJ2 = C08350Ul.LIZJ(j);
                } else {
                    i = (int) (j >> 32);
                    LIZJ2 = LIZJ(c0vg, C08350Ul.LIZJ(j), C08350Ul.LIZJ(c08350Ul.LIZ), i, false, C08350Ul.LJFF(j));
                }
                return C17N.LIZLLL(i, LIZJ2);
            }

            public static int LIZIZ(C0VG c0vg, int i, int i2, int i3, boolean z, boolean z2) {
                int LJFF;
                long LJIILJJIL = c0vg.LJIILJJIL(i);
                int i4 = (int) (LJIILJJIL >> 32);
                if (c0vg.LJI(i4) != i2) {
                    i4 = c0vg.LJIIJ(i2);
                }
                if (c0vg.LJI(C08350Ul.LIZJ(LJIILJJIL)) == i2) {
                    LJFF = C08350Ul.LIZJ(LJIILJJIL);
                } else {
                    LJFF = c0vg.LJFF(i2, false);
                }
                if (i4 == i3) {
                    return LJFF;
                }
                if (LJFF == i3) {
                    return i4;
                }
                int i5 = (i4 + LJFF) / 2;
                if (z ^ z2) {
                    if (i <= i5) {
                        return i4;
                    }
                } else if (i < i5) {
                    return i4;
                }
                return LJFF;
            }

            public static int LIZJ(C0VG c0vg, int i, int i2, int i3, boolean z, boolean z2) {
                if (i == -1) {
                    return i2;
                }
                int LJI = c0vg.LJI(i);
                if (LJI != c0vg.LJI(i2)) {
                    return LIZIZ(c0vg, i, LJI, i3, z, z2);
                }
                long LJIILJJIL = c0vg.LJIILJJIL(i2);
                if (i2 != ((int) (LJIILJJIL >> 32)) && i2 != C08350Ul.LIZJ(LJIILJJIL)) {
                    return i;
                }
                return LIZIZ(c0vg, i, LJI, i3, z, z2);
            }
        };
    }

    public static final long LIZ(C0VG c0vg, long j, InterfaceC88472Yns interfaceC88472Yns) {
        int i;
        int LIZJ2;
        if (c0vg.LIZ.LIZ.length() == 0) {
            return C08350Ul.LIZIZ;
        }
        int LJJLIIIJ = s.LJJLIIIJ(c0vg.LIZ.LIZ);
        long j2 = ((C08350Ul) interfaceC88472Yns.invoke(Integer.valueOf(C78842Uww.LJIIL((int) (j >> 32), 0, LJJLIIIJ)))).LIZ;
        long j3 = ((C08350Ul) interfaceC88472Yns.invoke(Integer.valueOf(C78842Uww.LJIIL(C08350Ul.LIZJ(j), 0, LJJLIIIJ)))).LIZ;
        if (C08350Ul.LJFF(j)) {
            i = C08350Ul.LIZJ(j2);
        } else {
            i = (int) (j2 >> 32);
        }
        if (C08350Ul.LJFF(j)) {
            LIZJ2 = (int) (j3 >> 32);
        } else {
            LIZJ2 = C08350Ul.LIZJ(j3);
        }
        return C17N.LIZLLL(i, LIZJ2);
    }
}

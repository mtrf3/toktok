package X;

/* renamed from: X.0tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21690tB {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, long j, float f, float f2, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC07790Sh LJIL;
        float f3;
        InterfaceC07790Sh LIZLLL;
        int i7;
        long j2 = j;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        float f4 = f;
        float f5 = f2;
        C35931b3 LJIL2 = interfaceC24520xk.LJIL(-1249392198);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL2.LJIJJ(interfaceC07790Sh2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && LJIL2.LJIIJ(j2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL2.LJII(f4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL2.LJII(f5)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) != 1170 || !LJIL2.LIZ()) {
            LJIL2.LJJZZIII();
            if ((i & 1) == 0 || LJIL2.LJJJLIIL()) {
                if (i8 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if ((i2 & 2) != 0) {
                    j2 = C11850dJ.LIZIZ(C21350sd.LIZ(LJIL2).LJ(), 0.12f);
                }
                if (i9 != 0) {
                    f4 = 1;
                }
                if (i10 != 0) {
                    f5 = 0;
                }
            } else {
                LJIL2.LIZLLL();
            }
            LJIL2.LJJJJJL();
            if (f5 == 0.0f) {
                LJIL = InterfaceC07790Sh.LJJJI;
            } else {
                LJIL = C70657RoD.LJIL(InterfaceC07790Sh.LJJJI, f5, 0.0f, 0.0f, 0.0f, 14);
            }
            LJIL2.LJJIIJ(1228914189);
            if (C23390vv.LIZJ(f4, 0.0f)) {
                f3 = 1.0f / ((InterfaceC23370vt) LJIL2.LJIILLIIL(AnonymousClass057.LJ)).getDensity();
            } else {
                f3 = f4;
            }
            LJIL2.LJJJJJ(false);
            LIZLLL = C78996UzQ.LIZLLL(C09290Yb.LJIIIIZZ(C09290Yb.LJII(interfaceC07790Sh2.LLLIIIL(LJIL)), f3), j2, C11710d5.LIZ);
            C0YZ.LIZ(LIZLLL, LJIL2, 0);
        } else {
            LJIL2.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL2.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C25P(interfaceC07790Sh2, j2, f4, f5, i, i2);
    }
}

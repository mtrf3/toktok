package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a49, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92029a49 {
    public static final void LIZ(String text, InterfaceC07790Sh interfaceC07790Sh, long j, long j2, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh LIZLLL;
        int i6;
        int i7;
        long j3 = j;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        long j4 = j2;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1929478030);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0 && LJIL.LJIIJ(j3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0 && LJIL.LJIIJ(j4)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if (((i3 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i8 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if ((i2 & 4) != 0) {
                    j3 = C91671ZyN.LIZ(LJIL).LJIJ;
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j4 = C91671ZyN.LIZ(LJIL).LJIIL;
                    i3 &= -7169;
                }
            } else {
                LJIL.LIZLLL();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            LJIL.LJJJJJL();
            C08370Un LIZ = C08370Un.LIZ(C91676ZyS.LIZIZ(C21350sd.LIZJ(LJIL), LJIL), j3, 0L, null, null, 262142);
            LIZLLL = C78996UzQ.LIZLLL(C78840Uwu.LJI(interfaceC07790Sh2, C17480mO.LIZ(2)), j4, C11710d5.LIZ);
            C21430sl.LIZIZ(text, C70657RoD.LJIJI(LIZLLL, 5, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, LIZ, LJIL, i3 & 14, 3072, 24572);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92958aJ8(text, interfaceC07790Sh2, j3, j4, i, i2);
    }
}

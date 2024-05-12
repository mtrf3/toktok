package X;

import com.google.gson.internal.b;
import kotlin.jvm.internal.o;

/* renamed from: X.a4b, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92057a4b {
    public static final C1JS LIZ = new C1JS(0.4f, 0.0f, 0.2f, 1.0f);
    public static final float LIZIZ = 42;
    public static final float LIZJ = 6;

    public static final void LIZ(float f, int i, int i2, long j, long j2, InterfaceC24520xk interfaceC24520xk, InterfaceC07790Sh interfaceC07790Sh) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        long j4 = j2;
        float f2 = f;
        C35931b3 LJIL = interfaceC24520xk.LJIL(533467594);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && LJIL.LJIIJ(j3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0 && LJIL.LJIIJ(j4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJII(f2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if (((i3 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i8 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if ((i2 & 2) != 0) {
                    j3 = C91671ZyN.LIZ(LJIL).LIZ;
                }
                if ((i2 & 4) != 0) {
                    j4 = C91671ZyN.LIZ(LJIL).LJIJJLI;
                }
                if (i9 != 0) {
                    f2 = LIZJ;
                }
            } else {
                LJIL.LIZLLL();
            }
            LJIL.LJJJJJL();
            C43041mW c43041mW = new C43041mW(((InterfaceC23370vt) LJIL.LJIILLIIL(AnonymousClass057.LJ)).LJJJJIZL(f2), 0.0f, 2, 0, 26);
            C07190Pz LJ = C1JJ.LJ(LJIL);
            C1JR c1jr = C0QD.LIZIZ;
            C1J1 c1j1 = C1J1.LIZ;
            C1JE LIZJ2 = C1JJ.LIZJ(LJ, 0, 5, c1jr, C1JI.LJIJJ(C1JI.LJJIJIIJIL(6660, 0, c1j1, 2), null, 6), LJIL);
            C1JE LIZIZ2 = C1JJ.LIZIZ(LJ, 286.0f, C1JI.LJIJJ(C1JI.LJJIJIIJIL(1332, 0, c1j1, 2), null, 6), LJIL);
            C1JE LIZIZ3 = C1JJ.LIZIZ(LJ, 290.0f, C1JI.LJIJJ(C1JI.LJJII(C92993aJh.LJLIL), null, 6), LJIL);
            C1JE LIZIZ4 = C1JJ.LIZIZ(LJ, 290.0f, C1JI.LJIJJ(C1JI.LJJII(C92994aJi.LJLIL), null, 6), LJIL);
            o.LJIIIZ(interfaceC07790Sh2, "<this>");
            C0SZ.LIZ(C09290Yb.LJIIJJI(b.LJJII(interfaceC07790Sh2, true, C49281wa.LJLIL), LIZIZ), new C92991aJf(f2, j3, j4, c43041mW, LIZJ2, LIZIZ3, LIZIZ4, LIZIZ2), LJIL, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92992aJg(f2, i, i2, j3, j4, interfaceC07790Sh2);
    }
}

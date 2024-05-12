package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a3O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91982a3O {
    public static final void LIZ(String text, InterfaceC91771Zzz interfaceC91771Zzz, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        long LJFF;
        float f;
        long j;
        InterfaceC91771Zzz interfaceC91771Zzz2 = interfaceC91771Zzz;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(924009866);
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
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((2 & (~i2)) != 0 || ((i3 & 731) ^ 146) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i6 != 0) {
                    interfaceC91771Zzz2 = C92370a9e.LIZJ;
                    i3 &= -113;
                }
                if (i7 != 0) {
                    interfaceC65784Pro2 = C92856aHU.LJLIL;
                }
            } else {
                LJIL.LIZLLL();
                if (i6 != 0) {
                    i3 &= -113;
                }
            }
            LJIL.LJJJJJL();
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = new C42191l9();
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            C1OH c1oh = (C1OH) LJJJZ;
            InterfaceC35811ar LJFF2 = C1O1.LJFF(c1oh, LJIL, 6);
            InterfaceC07790Sh LJII = C09290Yb.LJII(InterfaceC07790Sh.LJJJI);
            boolean booleanValue = ((Boolean) LJFF2.getValue()).booleanValue();
            LJIL.LJJIIJ(1213022065);
            if (C91671ZyN.LIZ) {
                LJFF = C78897Uxp.LJFF(4294967295L);
            } else {
                LJFF = C78897Uxp.LJFF(4281216558L);
            }
            float LIZLLL = C11850dJ.LIZLLL(LJFF);
            float f2 = 0.75f;
            if (booleanValue) {
                f = 0.75f;
            } else {
                f = 1.0f;
            }
            long LIZIZ = C11850dJ.LIZIZ(LJFF, LIZLLL * f);
            LJIL.LJJJJJ(false);
            boolean booleanValue2 = ((Boolean) LJFF2.getValue()).booleanValue();
            LJIL.LJJIIJ(-1452208645);
            if (o.LJ(interfaceC91771Zzz2, C92370a9e.LIZJ)) {
                j = C91733ZzN.LIZIZ();
            } else if (o.LJ(interfaceC91771Zzz2, C92369a9d.LIZJ)) {
                if (C91671ZyN.LIZ) {
                    j = C78897Uxp.LJFF(3087007744L);
                } else {
                    j = C78897Uxp.LJFF(3238002687L);
                }
            } else {
                j = C11850dJ.LJI;
            }
            float LIZLLL2 = C11850dJ.LIZLLL(j);
            if (!booleanValue2) {
                f2 = 1.0f;
            }
            long LIZIZ2 = C11850dJ.LIZIZ(j, LIZLLL2 * f2);
            LJIL.LJJJJJ(false);
            C21510st.LIZIZ(interfaceC65784Pro2, LJII, c1oh, C21380sg.LIZ(LIZIZ, LIZIZ2, 0L, 0L, LJIL, 32768, 12), C1DJ.LJ(LJIL, -819896212, new C92857aHV(text, interfaceC91771Zzz2, i3)), LJIL, ((i3 >> 6) & 14) | 805309488, 372);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92858aHW(text, interfaceC91771Zzz2, interfaceC65784Pro2, i, i2);
    }
}

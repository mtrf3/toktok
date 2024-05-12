package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zzc, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91748Zzc {
    public static final void LIZ(String text, boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3 = z2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(254725124);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJI(z3)) {
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
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if (((i3 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            if (i8 != 0) {
                z3 = false;
            }
            if (i9 != 0) {
                interfaceC65784Pro2 = C92483aBT.LJLIL;
            }
            int i10 = ((C92121a5d) LJIL.LJIILLIIL(C91674ZyQ.LIZ)).LJLIL;
            InterfaceC91769Zzx button = C91665ZyH.LIZ().getButton();
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            C92367a9b c92367a9b = C92367a9b.LJFF;
            C92370a9e c92370a9e = C92370a9e.LIZJ;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = new C42191l9();
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            int i11 = i3 << 12;
            button.LIZ(text, null, c1m1, c92367a9b, c92370a9e, z, z3, (C1OH) LJJJZ, i10, null, null, interfaceC65784Pro2, LJIL, 817926576 | (i3 & 14) | (458752 & i11) | (i11 & 3670016), ((i3 >> 6) & 112) | 518);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92484aBU(i, i2, text, interfaceC65784Pro2, z, z3);
    }
}

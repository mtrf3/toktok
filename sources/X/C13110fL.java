package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13110fL {
    public static final void LIZ(InterfaceC13090fJ itemProvider, InterfaceC07790Sh interfaceC07790Sh, C13140fO c13140fO, InterfaceC88471Ynr<? super InterfaceC516520z, ? super C23360vs, ? extends InterfaceC273515n> measurePolicy, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C13140fO c13140fO2 = c13140fO;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(itemProvider, "itemProvider");
        o.LJIIIZ(measurePolicy, "measurePolicy");
        C35931b3 LJIL = interfaceC24520xk.LJIL(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(itemProvider)) {
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
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(c13140fO2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(measurePolicy)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) != 1170 || !LJIL.LIZ()) {
            if (i8 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i9 != 0) {
                c13140fO2 = null;
            }
            C13040fE.LIZ(C1DJ.LJ(LJIL, 1342877611, new C516320x(c13140fO2, interfaceC07790Sh2, measurePolicy, i3, C78966Uyw.LJJJJIZL(itemProvider, LJIL), itemProvider)), LJIL, 6);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C516420y(itemProvider, interfaceC07790Sh2, c13140fO2, measurePolicy, i, i2);
    }
}

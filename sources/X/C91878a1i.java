package X;

/* renamed from: X.a1i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91878a1i {
    public static final void LIZ(C92283a8F c92283a8F, boolean z, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        boolean z2 = z;
        C92283a8F c92283a8F2 = c92283a8F;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1476296069);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(str)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if (((~i2) & 1) != 0 || ((i3 & 5841) ^ 1168) != 0 || !LJIL.LIZ()) {
            str2 = null;
            if ((i2 & 1) != 0) {
                c92283a8F2 = null;
            }
            if (i7 != 0) {
                z2 = true;
            }
            if (i8 == 0) {
                str2 = str;
            }
            if (i9 != 0) {
                interfaceC65784Pro2 = C92717aFF.LJLIL;
            }
            int i10 = i3 >> 3;
            C91876a1g.LIZ((i10 & 14) | (i10 & 112) | (i10 & 896), 0, LJIL, str2, interfaceC65784Pro2, z2);
        } else {
            LJIL.LIZLLL();
            str2 = str;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92718aFG(c92283a8F2, z2, str2, interfaceC65784Pro2, i, i2);
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7p, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92257a7p implements InterfaceC91776a04 {
    @Override // X.InterfaceC91776a04
    public final void LIZ(boolean z, String str, boolean z2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(2084627442);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJI(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (((i2 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            C92000a3g.LIZ(z, str, z2, content, LJIL, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168));
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92915aIR(this, z, str, z2, content, i);
    }
}

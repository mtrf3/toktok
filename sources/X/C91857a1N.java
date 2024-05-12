package X;

import kotlin.jvm.internal.IDqS12S0101000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a1N, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91857a1N {
    public static final void LIZ(String str, InterfaceC65784Pro<C76800UCe> onClose, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(onClose, "onClose");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1253379188);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(onClose)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            C91866a1W.LIZ(null, 0.0f, false, C1DJ.LJ(LJIL, -819895586, new IDqS12S0101000_31(i2, (InterfaceC65784Pro) onClose, 2)), C1DJ.LJ(LJIL, -819895750, new C92667aER(i2, str, onClose)), LJIL, 27648, 7);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92668aES(i, str, onClose);
    }
}

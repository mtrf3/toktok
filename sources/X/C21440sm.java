package X;

import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.o;

/* renamed from: X.0sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21440sm {
    public static final void LIZ(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1322912246);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !LJIL.LIZ()) {
            content.invoke(LJIL, Integer.valueOf(i2 & 14));
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(i, content, 10);
    }
}

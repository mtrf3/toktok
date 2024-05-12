package X;

import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.0oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18730oP {
    public static final void LIZ(C20140qg manager, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1985516685);
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !LJIL.LIZ()) {
            content.invoke(LJIL, Integer.valueOf((i2 >> 3) & 14));
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000(manager, (C20140qg) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 13);
    }
}

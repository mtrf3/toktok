package X;

import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0fE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13040fE {
    public static final void LIZ(InterfaceC88473Ynt<? super C0MC, ? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(674185128);
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
            C44031o7 c44031o7 = C0MH.LIZ;
            C0MG c0mg = (C0MG) LJIL.LJIILLIIL(c44031o7);
            C1RG c1rg = (C1RG) C73975T1n.LJIIIIZZ(new Object[]{c0mg}, C0MJ.LIZ(new IDqS416S0100000(c0mg, 207), C516120v.LJLIL), new IDqS420S0100000(c0mg, 122), LJIL, 4);
            C24410xZ.LIZ(new C24620xu[]{c44031o7.LIZIZ(c1rg)}, C1DJ.LJ(LJIL, 1863926504, new IDqS2S0201000(c1rg, (C1RG) content, (InterfaceC88473Ynt<? super C0MC, ? super InterfaceC24520xk, ? super Integer, C76800UCe>) i2, 9)), LJIL, 56);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(content, (InterfaceC88473Ynt<? super C0MC, ? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 6);
    }
}

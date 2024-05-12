package X;

import kotlin.jvm.internal.IDqS12S0101000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a4K, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92040a4K {
    public static final void LIZ(Object icon, String title, String str, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        float f;
        boolean z5 = z;
        String str2 = str;
        boolean z6 = z4;
        boolean z7 = z2;
        boolean z8 = z3;
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1199368886);
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = null;
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            z5 = false;
        }
        if ((i2 & 16) != 0) {
            z7 = false;
        }
        if ((i2 & 32) != 0) {
            z8 = false;
        }
        if ((i2 & 64) != 0) {
            z6 = true;
        }
        if ((i2 & 256) == 0) {
            interfaceC88471Ynr3 = interfaceC88471Ynr2;
        }
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        if (z8) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C92038a4I.LIZIZ(C78866UxK.LJIIL(c1m1, f), C1DJ.LJ(LJIL, -819892321, new C92982aJW(i, title, str2, icon)), C1DJ.LJ(LJIL, -819893689, new IDqS12S0101000_31(i, (InterfaceC88471Ynr) interfaceC88471Ynr, 6)), C1DJ.LJ(LJIL, -819893645, new C92983aJX(z8, z7, interfaceC88471Ynr3, i, z5)), false, z6, null, onClick, LJIL, ((i >> 3) & 458752) | 3504 | ((i >> 6) & 29360128), 80);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92984aJY(icon, title, str2, z5, z7, z8, z6, interfaceC88471Ynr, interfaceC88471Ynr3, onClick, i, i2);
    }
}

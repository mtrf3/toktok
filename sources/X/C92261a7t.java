package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92261a7t implements InterfaceC91779a07 {
    @Override // X.InterfaceC91779a07
    public final void LIZ(Object icon, String title, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1086739110);
        int i3 = i >> 3;
        C92005a3l.LIZ(icon, title, str, z2, z3, z, z4, z5, interfaceC88471Ynr, interfaceC88471Ynr2, onClick, LJIL, (i & 112) | 8 | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i << 9) & 458752) | (i & 3670016) | (i & 29360128) | (i & 234881024) | (i & 1879048192), i2 & 14, 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92920aIW(this, icon, title, z, str, z2, z3, z4, z5, interfaceC88471Ynr, interfaceC88471Ynr2, onClick, i, i2);
    }
}

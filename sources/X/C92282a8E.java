package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8E, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92282a8E implements InterfaceC91779a07 {
    @Override // X.InterfaceC91779a07
    public final void LIZ(Object icon, String title, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(886746581);
        int i3 = i >> 3;
        C92040a4K.LIZ(icon, title, str, z2, z3, z4, false, interfaceC88471Ynr, interfaceC88471Ynr2, onClick, LJIL, (i & 112) | 8 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & i3) | (i3 & 234881024) | ((i2 << 27) & 1879048192), 64);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92980aJU(this, icon, title, z, str, z2, z3, z4, z5, interfaceC88471Ynr, interfaceC88471Ynr2, onClick, i, i2);
    }
}

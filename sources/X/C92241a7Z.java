package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7Z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92241a7Z implements InterfaceC91769Zzx {
    @Override // X.InterfaceC91769Zzx
    public final void LIZ(String title, Integer num, InterfaceC07790Sh modifier, InterfaceC91770Zzy size, InterfaceC91771Zzz type, boolean z, boolean z2, C1OH interactionSource, float f, C11850dJ c11850dJ, C11850dJ c11850dJ2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(size, "size");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1740721720);
        int i3 = i >> 9;
        C91973a3F.LIZ(title, num, z, z2, type, onClick, LJIL, (i & 14) | 32768 | (i & 112) | (i3 & 896) | (i3 & 7168) | ((i2 << 12) & 458752), 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92854aHS(this, title, num, modifier, size, type, z, z2, interactionSource, f, c11850dJ, c11850dJ2, onClick, i, i2);
    }
}

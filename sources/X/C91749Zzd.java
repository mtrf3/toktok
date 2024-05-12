package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zzd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91749Zzd {
    public static final void LIZ(String text, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1086893169);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(onClick)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            int i5 = ((C92121a5d) LJIL.LJIILLIIL(C91674ZyQ.LIZ)).LJLIL;
            C91986a3S.LIZ(C09290Yb.LJII(InterfaceC07790Sh.LJJJI), text, null, true, false, new C92247a7f(16, 0, Integer.MAX_VALUE, 44), i5, null, null, new C11850dJ(C78897Uxp.LJFF(4283453520L)), new C11850dJ(C11850dJ.LIZJ), onClick, LJIL, ((i2 << 3) & 112) | 805309446, (i2 & 112) | 6, 404);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92485aBV(i, text, onClick);
    }
}

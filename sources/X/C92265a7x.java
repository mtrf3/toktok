package X;

import kotlin.jvm.internal.IDqS3S0201000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a7x, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92265a7x implements InterfaceC91777a05 {
    @Override // X.InterfaceC91777a05
    public final void LIZ(InterfaceC07790Sh modifier, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        o.LJIIIZ(modifier, "modifier");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1686773495);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((2 ^ (i2 & 11)) != 0 || !LJIL.LIZ()) {
            C92013a3t.LIZ(modifier, LJIL, i2 & 14, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS3S0201000_31(this, modifier, i, 1);
    }
}

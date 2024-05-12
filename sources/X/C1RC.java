package X;

import kotlin.jvm.internal.IDqS0S0102000;

/* renamed from: X.1RC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RC implements InterfaceC13090fJ {
    public final InterfaceC24760y8<InterfaceC13090fJ> LIZ;

    @Override // X.InterfaceC13090fJ
    public final java.util.Map<Object, Integer> LJI() {
        return this.LIZ.getValue().LJI();
    }

    @Override // X.InterfaceC13090fJ
    public final int getItemCount() {
        return this.LIZ.getValue().getItemCount();
    }

    public C1RC(C44001o4 c44001o4) {
        this.LIZ = c44001o4;
    }

    @Override // X.InterfaceC13090fJ
    public final Object LJFF(int i) {
        return this.LIZ.getValue().LJFF(i);
    }

    @Override // X.InterfaceC13090fJ
    public final Object LJII(int i) {
        return this.LIZ.getValue().LJII(i);
    }

    @Override // X.InterfaceC13090fJ
    public final void LIZ(int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1633511187);
        if ((i2 & 14) == 0) {
            if (LJIL.LJIIIZ(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !LJIL.LIZ()) {
            this.LIZ.getValue().LIZ(i, LJIL, i3 & 14);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS0S0102000(this, i, i2, 2);
    }
}

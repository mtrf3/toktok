package X;

import java.util.List;
import kotlin.jvm.internal.IDqS0S0102000;
import kotlin.jvm.internal.IDqS447S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42331lN implements InterfaceC32551Pn, InterfaceC13090fJ {
    public final List<Integer> LIZ;
    public final C32501Pi LIZIZ;
    public final /* synthetic */ C1RD LIZJ;

    @Override // X.InterfaceC13090fJ
    public final Object LJFF(int i) {
        return this.LIZJ.LJFF(i);
    }

    @Override // X.InterfaceC13090fJ
    public final Object LJII(int i) {
        return this.LIZJ.LJII(i);
    }

    @Override // X.InterfaceC13090fJ
    public final int getItemCount() {
        return this.LIZJ.getItemCount();
    }

    @Override // X.InterfaceC13090fJ
    public final java.util.Map<Object, Integer> LJI() {
        return this.LIZJ.LIZJ;
    }

    @Override // X.InterfaceC32551Pn
    public final C32501Pi LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC32551Pn
    public final List<Integer> LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC13090fJ
    public final void LIZ(int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1645068522);
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
            this.LIZJ.LIZ(i, LJIL, i3 & 14);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS0S0102000(this, i, i2, 0);
    }

    public C42331lN(C1RJ intervals, C40517FvF nearestItemsRange, C61878OQg headerIndexes, C32501Pi itemScope) {
        o.LJIIIZ(intervals, "intervals");
        o.LJIIIZ(nearestItemsRange, "nearestItemsRange");
        o.LJIIIZ(headerIndexes, "headerIndexes");
        o.LJIIIZ(itemScope, "itemScope");
        this.LIZ = headerIndexes;
        this.LIZIZ = itemScope;
        this.LIZJ = new C1RD(intervals, C1DJ.LJFF(new IDqS447S0100000(itemScope, 1), -1230121334, true), nearestItemsRange);
    }
}

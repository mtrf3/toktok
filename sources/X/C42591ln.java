package X;

import kotlin.jvm.internal.IDqS0S0102000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42591ln implements C1QN, InterfaceC13090fJ {
    public final InterfaceC13010fB<C1QK> LIZ;
    public final boolean LIZIZ;
    public final /* synthetic */ C1RD LIZJ;
    public final C11420cc LIZLLL;

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

    @Override // X.C1QN
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.C1QN
    public final C11420cc LJIIIIZZ() {
        return this.LIZLLL;
    }

    @Override // X.C1QN
    public final long LJ(int i) {
        C1QO c1qo = new InterfaceC11470ch() { // from class: X.1QO
        };
        C13000fA<C1QK> c13000fA = this.LIZ.get(i);
        return c13000fA.LIZJ.LIZIZ.invoke(c1qo, Integer.valueOf(i - c13000fA.LIZ)).LIZ;
    }

    public C42591ln(C1RJ intervals, boolean z, C40517FvF nearestItemsRange) {
        o.LJIIIZ(intervals, "intervals");
        o.LJIIIZ(nearestItemsRange, "nearestItemsRange");
        this.LIZ = intervals;
        this.LIZIZ = z;
        C40431iJ itemContent = C11230cJ.LIZ;
        o.LJIIIZ(itemContent, "itemContent");
        this.LIZJ = new C1RD(intervals, itemContent, nearestItemsRange);
        this.LIZLLL = new C11420cc(this);
    }

    @Override // X.InterfaceC13090fJ
    public final void LIZ(int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1355196996);
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
        LJJJJLI.LIZLLL = new IDqS0S0102000(this, i, i2, 1);
    }
}

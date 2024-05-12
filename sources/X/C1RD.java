package X;

import X.InterfaceC13030fD;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS0S0102000;
import kotlin.jvm.internal.o;

/* renamed from: X.1RD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RD<IntervalContent extends InterfaceC13030fD> implements InterfaceC13090fJ {
    public final InterfaceC88474Ynu<IntervalContent, Integer, InterfaceC24520xk, Integer, C76800UCe> LIZ;
    public final InterfaceC13010fB<IntervalContent> LIZIZ;
    public final java.util.Map<Object, Integer> LIZJ;

    @Override // X.InterfaceC13090fJ
    public final int getItemCount() {
        return this.LIZIZ.getSize();
    }

    @Override // X.InterfaceC13090fJ
    public final java.util.Map<Object, Integer> LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC13090fJ
    public final Object LJFF(int i) {
        C13000fA<IntervalContent> c13000fA = this.LIZIZ.get(i);
        return c13000fA.LIZJ.getType().invoke(Integer.valueOf(i - c13000fA.LIZ));
    }

    @Override // X.InterfaceC13090fJ
    public final Object LJII(int i) {
        Object invoke;
        C13000fA<IntervalContent> c13000fA = this.LIZIZ.get(i);
        int i2 = i - c13000fA.LIZ;
        InterfaceC88472Yns<Integer, Object> key = c13000fA.LIZJ.getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) {
            return new DefaultLazyKey(i);
        }
        return invoke;
    }

    public C1RD(C1RJ intervals, C40431iJ itemContentProvider, C40517FvF nearestItemsRange) {
        java.util.Map map;
        o.LJIIIZ(itemContentProvider, "itemContentProvider");
        o.LJIIIZ(intervals, "intervals");
        o.LJIIIZ(nearestItemsRange, "nearestItemsRange");
        this.LIZ = itemContentProvider;
        this.LIZIZ = intervals;
        int i = nearestItemsRange.LJLIL;
        if (i >= 0) {
            int min = Math.min(nearestItemsRange.LJLILLLLZI, intervals.LIZIZ - 1);
            if (min < i) {
                map = C113554cx.LJJJLIIL();
            } else {
                HashMap hashMap = new HashMap();
                intervals.LIZJ(i, min, new C516020u(i, min, hashMap));
                map = hashMap;
            }
            this.LIZJ = map;
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC13090fJ
    public final void LIZ(int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1877726744);
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
            C13000fA<IntervalContent> c13000fA = this.LIZIZ.get(i);
            int i6 = i - c13000fA.LIZ;
            this.LIZ.invoke(c13000fA.LIZJ, Integer.valueOf(i6), LJIL, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS0S0102000(this, i, i2, 3);
    }
}

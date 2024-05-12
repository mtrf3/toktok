package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1RC;
import X.C1RD;
import X.C42331lN;
import X.C42591ln;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;

/* loaded from: classes.dex */
public class IDqS0S0102000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS0S0102000 iDqS0S0102000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C42331lN) iDqS0S0102000.l0).LIZ(iDqS0S0102000.i1, (InterfaceC24520xk) obj, iDqS0S0102000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0102000 iDqS0S0102000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C42591ln) iDqS0S0102000.l0).LIZ(iDqS0S0102000.i1, (InterfaceC24520xk) obj, iDqS0S0102000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS0S0102000 iDqS0S0102000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1RC) iDqS0S0102000.l0).LIZ(iDqS0S0102000.i1, (InterfaceC24520xk) obj, iDqS0S0102000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS0S0102000 iDqS0S0102000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1RD) iDqS0S0102000.l0).LIZ(iDqS0S0102000.i1, (InterfaceC24520xk) obj, iDqS0S0102000.i2 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0102000(C1RC c1rc, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c1rc;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0102000(C1RD c1rd, C1RD<IntervalContent> c1rd2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1rd;
        this.i1 = c1rd2;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0102000(C42331lN c42331lN, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c42331lN;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0102000(C42591ln c42591ln, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c42591ln;
        this.i1 = i;
        this.i2 = i2;
    }
}

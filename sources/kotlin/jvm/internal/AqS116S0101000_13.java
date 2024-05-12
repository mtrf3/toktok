package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.V2J;
import X.V5J;

/* loaded from: classes14.dex */
public class AqS116S0101000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS116S0101000_13(V2J v2j, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = v2j;
        this.i1 = i;
    }

    public static final Object invoke$0(AqS116S0101000_13 aqS116S0101000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((V2J) aqS116S0101000_13.l0).LIZ((InterfaceC24520xk) obj, aqS116S0101000_13.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS116S0101000_13 aqS116S0101000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((V5J) aqS116S0101000_13.l0).LIZ((InterfaceC24520xk) obj, aqS116S0101000_13.i1 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS116S0101000_13(V5J v5j, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = v5j;
        this.i1 = i;
    }
}

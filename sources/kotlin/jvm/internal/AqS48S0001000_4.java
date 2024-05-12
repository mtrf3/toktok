package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C79166V5e;
import X.C79179V5r;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;

/* loaded from: classes5.dex */
public class AqS48S0001000_4 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i0;

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
    public AqS48S0001000_4(int i, int i2) {
        super(2);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS48S0001000_4 aqS48S0001000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C79166V5e.LIZIZ((InterfaceC24520xk) obj, aqS48S0001000_4.i0 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS48S0001000_4 aqS48S0001000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C79179V5r.LIZ((InterfaceC24520xk) obj, aqS48S0001000_4.i0 | 1);
        return C76800UCe.LIZ;
    }
}

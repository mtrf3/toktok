package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.V5N;

/* loaded from: classes14.dex */
public class AqS5S0501000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AqS5S0501000_13 aqS5S0501000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5N.LIZIZ((InterfaceC88472Yns) aqS5S0501000_13.l0, (InterfaceC88472Yns) aqS5S0501000_13.l1, (InterfaceC88472Yns) aqS5S0501000_13.l2, (InterfaceC65784Pro) aqS5S0501000_13.l3, (InterfaceC88472Yns) aqS5S0501000_13.l4, (InterfaceC24520xk) obj, aqS5S0501000_13.i5 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S0501000_13 aqS5S0501000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5N.LIZJ((InterfaceC88472Yns) aqS5S0501000_13.l0, (InterfaceC88472Yns) aqS5S0501000_13.l1, (InterfaceC88472Yns) aqS5S0501000_13.l2, (InterfaceC65784Pro) aqS5S0501000_13.l3, (InterfaceC88472Yns) aqS5S0501000_13.l4, (InterfaceC24520xk) obj, aqS5S0501000_13.i5 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S0501000_13(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns5, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC88472Yns3;
        this.l3 = interfaceC88472Yns4;
        this.l4 = interfaceC65784Pro;
        this.i5 = interfaceC88472Yns5;
    }
}

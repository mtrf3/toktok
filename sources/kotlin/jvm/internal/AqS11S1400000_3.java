package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;

/* loaded from: classes4.dex */
public class AqS11S1400000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS11S1400000_3 aqS11S1400000_3, Object obj) {
        ((C34K) aqS11S1400000_3.l1).element = true;
        if (((C34K) aqS11S1400000_3.l2).element) {
            ((InterfaceC88471Ynr) aqS11S1400000_3.l3).invoke(aqS11S1400000_3.s0, Boolean.valueOf(((C34K) aqS11S1400000_3.l4).element));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS11S1400000_3 aqS11S1400000_3, Object obj) {
        ((C34K) aqS11S1400000_3.l1).element = true;
        if (((C34K) aqS11S1400000_3.l2).element) {
            ((InterfaceC88471Ynr) aqS11S1400000_3.l3).invoke(aqS11S1400000_3.s0, Boolean.valueOf(((C34K) aqS11S1400000_3.l4).element));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S1400000_3(String str, InterfaceC88471Ynr interfaceC88471Ynr, C34K c34k, C34K c34k2, C34K c34k3, int i) {
        super(1);
        this.$t = i;
        this.l1 = c34k;
        this.l2 = c34k2;
        this.l3 = interfaceC88471Ynr;
        this.s0 = str;
        this.l4 = c34k3;
    }
}

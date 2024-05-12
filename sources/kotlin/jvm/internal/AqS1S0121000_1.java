package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C79165V5d;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.V5N;

/* loaded from: classes2.dex */
public class AqS1S0121000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i3;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AqS1S0121000_1 aqS1S0121000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5N.LJI(aqS1S0121000_1.z1, aqS1S0121000_1.z2, (InterfaceC88472Yns) aqS1S0121000_1.l0, (InterfaceC24520xk) obj, aqS1S0121000_1.i3 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0121000_1 aqS1S0121000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C79165V5d.LJFF(aqS1S0121000_1.z1, aqS1S0121000_1.z2, (InterfaceC88472Yns) aqS1S0121000_1.l0, (InterfaceC24520xk) obj, aqS1S0121000_1.i3 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS1S0121000_1(boolean z, boolean z2, boolean z3, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = z3;
        this.i3 = interfaceC88472Yns;
    }
}

package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C79165V5d;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.V5N;

/* loaded from: classes14.dex */
public class AqS0S0212000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AqS0S0212000_13 aqS0S0212000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5N.LIZLLL(aqS0S0212000_13.z2, (InterfaceC07790Sh) aqS0S0212000_13.l0, (InterfaceC65784Pro) aqS0S0212000_13.l1, (InterfaceC24520xk) obj, aqS0S0212000_13.i3 | 1, aqS0S0212000_13.i4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0212000_13 aqS0S0212000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C79165V5d.LIZJ(aqS0S0212000_13.z2, (InterfaceC07790Sh) aqS0S0212000_13.l0, (InterfaceC65784Pro) aqS0S0212000_13.l1, (InterfaceC24520xk) obj, aqS0S0212000_13.i3 | 1, aqS0S0212000_13.i4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S0212000_13(boolean z, boolean z2, InterfaceC07790Sh interfaceC07790Sh, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.$t = i2;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = interfaceC07790Sh;
        this.i3 = interfaceC65784Pro;
        this.i4 = i;
    }
}

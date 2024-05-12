package kotlin.jvm.internal;

import X.AR6;
import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C79166V5e;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.V5R;
import X.V7H;

/* loaded from: classes14.dex */
public class AqS18S0202000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS18S0202000_13 aqS18S0202000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C79166V5e.LIZ((AR6) aqS18S0202000_13.l0, (InterfaceC07790Sh) aqS18S0202000_13.l1, (InterfaceC24520xk) obj, aqS18S0202000_13.i2 | 1, aqS18S0202000_13.i3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S0202000_13 aqS18S0202000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5R.LIZLLL((InterfaceC07790Sh) aqS18S0202000_13.l0, (V7H) aqS18S0202000_13.l1, (InterfaceC24520xk) obj, aqS18S0202000_13.i2 | 1, aqS18S0202000_13.i3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0202000_13(InterfaceC07790Sh interfaceC07790Sh, V7H v7h, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC07790Sh;
        this.l1 = v7h;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0202000_13(AR6 ar6, InterfaceC07790Sh interfaceC07790Sh, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = ar6;
        this.l1 = interfaceC07790Sh;
        this.i2 = i;
        this.i3 = i2;
    }
}

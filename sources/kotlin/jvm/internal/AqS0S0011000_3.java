package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C177616y5;
import X.C212208Um;
import X.C43I;
import X.C8LI;
import X.InterfaceC88472Yns;

/* loaded from: classes4.dex */
public class AqS0S0011000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public boolean z0;

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

    public static final Object invoke$0(AqS0S0011000_3 aqS0S0011000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, aqS0S0011000_3.z0, aqS0S0011000_3.i1, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -97, 31);
    }

    public static final Object invoke$1(AqS0S0011000_3 aqS0S0011000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(new C8LI(aqS0S0011000_3.z0, aqS0S0011000_3.i1)), null, null, null, null, null, 16515071);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0011000_3(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}

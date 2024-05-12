package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C175616ur;
import X.C175626us;
import X.C175636ut;
import X.C175886vI;
import X.C1807277k;
import X.C194567kK;
import X.C43I;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes4.dex */
public class AqS4S0002000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S0002000_3 aqS4S0002000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, null, new C43I(new C175626us(20002, aqS4S0002000_3.i0, aqS4S0002000_3.i1)), false, 47);
    }

    public static final Object invoke$1(AqS4S0002000_3 aqS4S0002000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, new C43I(new C175616ur(aqS4S0002000_3.i0, aqS4S0002000_3.i1)), null, null, false, 59);
    }

    public static final Object invoke$2(AqS4S0002000_3 aqS4S0002000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, new C43I(new C175636ut(20002, aqS4S0002000_3.i0, aqS4S0002000_3.i1)), null, false, 55);
    }

    public static final Object invoke$3(AqS4S0002000_3 aqS4S0002000_3, Object obj) {
        C194567kK setState = (C194567kK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C194567kK.LIZ(setState, null, aqS4S0002000_3.i0, aqS4S0002000_3.i1, 0, false, 25);
    }

    public static final Object invoke$4(AqS4S0002000_3 aqS4S0002000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C1807277k(new C43I(new OSZ(Integer.valueOf(aqS4S0002000_3.i0), Integer.valueOf(aqS4S0002000_3.i1))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0002000_3(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}

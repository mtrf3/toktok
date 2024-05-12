package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import X.K2M;

/* loaded from: classes9.dex */
public class AqS0S0003000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;
    public int i2;

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

    public static final Object invoke$0(AqS0S0003000_8 aqS0S0003000_8, Object obj) {
        K2M setState = (K2M) obj;
        o.LJIIIZ(setState, "$this$setState");
        return K2M.L(setState, aqS0S0003000_8.i0, aqS0S0003000_8.i1, aqS0S0003000_8.i2, 0L, true, 8);
    }

    public static final Object invoke$1(AqS0S0003000_8 aqS0S0003000_8, Object obj) {
        K2M setState = (K2M) obj;
        o.LJIIIZ(setState, "$this$setState");
        return K2M.L(setState, aqS0S0003000_8.i0, aqS0S0003000_8.i1, aqS0S0003000_8.i2, 0L, false, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0003000_8(int i, int i2, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.i0 = i;
        this.i1 = i2;
        this.i2 = i3;
    }
}

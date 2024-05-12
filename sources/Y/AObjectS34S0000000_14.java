package Y;

import X.C83621Wrp;
import X.C83622Wrq;
import X.InterfaceC88472Yns;

/* loaded from: classes15.dex */
public class AObjectS34S0000000_14 implements InterfaceC88472Yns {
    public final int $t;

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

    public AObjectS34S0000000_14(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS34S0000000_14 aObjectS34S0000000_14, Object obj) {
        return C83622Wrq.M1((Integer) obj);
    }

    public static final Object invoke$1(AObjectS34S0000000_14 aObjectS34S0000000_14, Object obj) {
        return C83621Wrp.H((Integer) obj);
    }
}

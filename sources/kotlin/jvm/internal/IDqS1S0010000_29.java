package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C91477ZvF;
import X.C91609ZxN;
import X.InterfaceC88472Yns;

/* loaded from: classes22.dex */
public class IDqS1S0010000_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS1S0010000_29(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(IDqS1S0010000_29 iDqS1S0010000_29, Object obj) {
        C91609ZxN setState = (C91609ZxN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C91609ZxN.LIZ(setState, null, Boolean.valueOf(iDqS1S0010000_29.z0), false, 5);
    }

    public static final Object invoke$1(IDqS1S0010000_29 iDqS1S0010000_29, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C91477ZvF(new C43I(Boolean.valueOf(iDqS1S0010000_29.z0)));
    }
}

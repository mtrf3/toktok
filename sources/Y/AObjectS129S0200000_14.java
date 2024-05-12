package Y;

import X.C46156I9o;
import X.C82622Wbi;
import X.C83621Wrp;
import X.I0N;
import X.I3P;
import X.I3Q;
import X.I3X;
import X.InterfaceC65784Pro;

/* loaded from: classes15.dex */
public class AObjectS129S0200000_14 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS129S0200000_14 aObjectS129S0200000_14) {
        return C83621Wrp.LLLLZIL((C83621Wrp) aObjectS129S0200000_14.l0, (C82622Wbi) aObjectS129S0200000_14.l1);
    }

    public static final Object invoke$1(AObjectS129S0200000_14 aObjectS129S0200000_14) {
        I0N i0n = (I0N) aObjectS129S0200000_14.l0;
        I3X i3x = (I3X) aObjectS129S0200000_14.l1;
        i0n.W90(false, "");
        I3Q.LIZ(I3P.LIGHTENING);
        i3x.JE(new C46156I9o("take photo"));
        return null;
    }

    public AObjectS129S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

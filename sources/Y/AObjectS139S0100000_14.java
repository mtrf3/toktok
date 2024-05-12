package Y;

import X.C83621Wrp;
import X.InterfaceC65784Pro;

/* loaded from: classes15.dex */
public class AObjectS139S0100000_14 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS139S0100000_14 aObjectS139S0100000_14) {
        return C83621Wrp.B((C83621Wrp) aObjectS139S0100000_14.l0);
    }

    public static final Object invoke$1(AObjectS139S0100000_14 aObjectS139S0100000_14) {
        return ((C83621Wrp) aObjectS139S0100000_14.l0).LLLL;
    }

    public static final Object invoke$2(AObjectS139S0100000_14 aObjectS139S0100000_14) {
        return ((C83621Wrp) aObjectS139S0100000_14.l0).LLIIZ;
    }

    public AObjectS139S0100000_14(C83621Wrp c83621Wrp, int i) {
        this.$t = i;
        this.l0 = c83621Wrp;
    }
}

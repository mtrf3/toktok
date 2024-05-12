package Y;

import X.BLD;
import X.C76800UCe;
import X.InterfaceC65784Pro;

/* loaded from: classes14.dex */
public class AObjectS26S0000000_13 implements InterfaceC65784Pro {
    public final int $t;

    public static final Object invoke$1(AObjectS26S0000000_13 aObjectS26S0000000_13) {
        return "connection_status";
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public AObjectS26S0000000_13(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS26S0000000_13 aObjectS26S0000000_13) {
        return new BLD(1);
    }

    public static final Object invoke$2(AObjectS26S0000000_13 aObjectS26S0000000_13) {
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS26S0000000_13 aObjectS26S0000000_13) {
        return new BLD(0);
    }
}

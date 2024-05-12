package Y;

import X.C44018HPi;
import X.FMX;
import X.InterfaceC88471Ynr;

/* loaded from: classes8.dex */
public class AObjectS58S0000000_7 implements InterfaceC88471Ynr {
    public final int $t;

    public static final Object invoke$1(AObjectS58S0000000_7 aObjectS58S0000000_7, Object obj, Object obj2) {
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS58S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS58S0000000_7 aObjectS58S0000000_7, Object obj, Object obj2) {
        FMX.onEventV3("tcm_bctoggle_show");
        return null;
    }

    public static final Object invoke$2(AObjectS58S0000000_7 aObjectS58S0000000_7, Object obj, Object obj2) {
        C44018HPi.LIZJ = (String) obj;
        C44018HPi.LIZIZ = (String) obj2;
        return null;
    }
}

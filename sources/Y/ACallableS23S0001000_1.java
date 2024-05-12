package Y;

import X.C188727au;
import X.C76800UCe;
import X.FMX;
import X.FPJ;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ACallableS23S0001000_1 implements Callable {
    public final int $t;
    public int i0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS23S0001000_1 aCallableS23S0001000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(aCallableS23S0001000_1.i0, "result");
        FMX.LJIIL("ies_network_speed_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS23S0001000_1 aCallableS23S0001000_1) {
        switch (aCallableS23S0001000_1.i0) {
            case 0:
                FMX.onEventV3("slide_up_show_loading");
                return null;
            default:
                new FPJ("snapboost_list_search.txt").LIZJ();
                return null;
        }
    }

    public ACallableS23S0001000_1(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}

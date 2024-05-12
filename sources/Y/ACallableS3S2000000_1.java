package Y;

import X.C188727au;
import X.C76800UCe;
import X.FMX;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ACallableS3S2000000_1 implements Callable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS3S2000000_1 aCallableS3S2000000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", aCallableS3S2000000_1.s0);
        c188727au.LJIIIZ("enter_from", aCallableS3S2000000_1.s1);
        FMX.LJIIL("free_data_give_pop_up", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS3S2000000_1 aCallableS3S2000000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", aCallableS3S2000000_1.s0);
        c188727au.LJIIIZ("enter_from", aCallableS3S2000000_1.s1);
        FMX.LJIIL("h5_click_buy_free_data", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS3S2000000_1 aCallableS3S2000000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("result", aCallableS3S2000000_1.s0);
        c188727au.LJIIIZ("url", aCallableS3S2000000_1.s1);
        FMX.LJIIL("bemobi_show_buy_data_h5_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS3S2000000_1(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}

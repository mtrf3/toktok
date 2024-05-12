package Y;

import X.C188727au;
import X.C76800UCe;
import X.FMX;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ACallableS7S1101000_1 implements Callable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object call$0(ACallableS7S1101000_1 aCallableS7S1101000_1) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(aCallableS7S1101000_1.i2, "result");
        c188727au.LJIIIZ("body", aCallableS7S1101000_1.s0);
        Exception exc = (Exception) aCallableS7S1101000_1.l1;
        if (exc == null || (str = exc.toString()) == null) {
            str = "no error";
        }
        c188727au.LJIIIZ("error", str);
        FMX.LJIIL("bemobi_validation_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS7S1101000_1 aCallableS7S1101000_1) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(aCallableS7S1101000_1.i2, "code");
        c188727au.LJIIIZ("status", aCallableS7S1101000_1.s0);
        Exception exc = (Exception) aCallableS7S1101000_1.l1;
        if (exc == null || (str = exc.toString()) == null) {
            str = "no error";
        }
        c188727au.LJIIIZ("error", str);
        FMX.LJIIL("bemobi_eligibility_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS7S1101000_1 aCallableS7S1101000_1) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(aCallableS7S1101000_1.i2, "code");
        c188727au.LJIIIZ("url", aCallableS7S1101000_1.s0);
        Exception exc = (Exception) aCallableS7S1101000_1.l1;
        if (exc == null || (str = exc.toString()) == null) {
            str = "no error";
        }
        c188727au.LJIIIZ("error", str);
        FMX.LJIIL("bemobi_free_data_recharge_result", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS7S1101000_1(int i, String str, Exception exc, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = exc;
    }
}

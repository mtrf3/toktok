package Y;

import X.C16880lQ;
import X.C61234O1m;
import X.C61243O1v;
import X.C61250O2c;
import X.C76800UCe;
import X.O1M;
import X.O26;
import X.O2C;
import X.O2Y;
import X.ORZ;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public class ACallableS39S1200000_10 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final Object call$0(ACallableS39S1200000_10 aCallableS39S1200000_10) {
        C61234O1m c61234O1m;
        try {
            if ((!((List) aCallableS39S1200000_10.l2).isEmpty()) && (c61234O1m = ((C61243O1v) aCallableS39S1200000_10.l1).LIZ) != null) {
                c61234O1m.put(aCallableS39S1200000_10.s0, ORZ.LLILZIL((List) aCallableS39S1200000_10.l2));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS39S1200000_10 aCallableS39S1200000_10) {
        O2Y o2y;
        try {
            if ((!((List) aCallableS39S1200000_10.l2).isEmpty()) && (o2y = ((C61250O2c) aCallableS39S1200000_10.l1).LIZ) != null) {
                o2y.put(aCallableS39S1200000_10.s0, ORZ.LLILZIL((List) aCallableS39S1200000_10.l2));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS39S1200000_10 aCallableS39S1200000_10) {
        O2C.LIZJ((O1M) aCallableS39S1200000_10.l2, (O26) aCallableS39S1200000_10.l1, aCallableS39S1200000_10.s0, false);
        return C76800UCe.LIZ;
    }

    public ACallableS39S1200000_10(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}

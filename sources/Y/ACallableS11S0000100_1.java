package Y;

import X.C55406Loo;
import X.C76800UCe;
import X.FMX;
import X.OSZ;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ACallableS11S0000100_1 implements Callable {
    public final int $t;
    public long j0;

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

    public static final Object call$0(ACallableS11S0000100_1 aCallableS11S0000100_1) {
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LIZLLL = "search_empty_page";
        c55406Loo.LJJL = String.valueOf(aCallableS11S0000100_1.j0);
        c55406Loo.LJIILIIL();
        return null;
    }

    public static final Object call$1(ACallableS11S0000100_1 aCallableS11S0000100_1) {
        FMX.LJIILL("notice_count_handle", new OSZ("duration", String.valueOf(aCallableS11S0000100_1.j0)));
        return C76800UCe.LIZ;
    }

    public ACallableS11S0000100_1(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}

package X;

import Y.ACallableS79S0101000_7;
import java.util.concurrent.FutureTask;

/* loaded from: classes7.dex */
public class FSB extends FutureTask implements Comparable<FSB> {
    public final int LJLIL;

    @Override // java.lang.Comparable
    public final int compareTo(FSB fsb) {
        int i = this.LJLIL;
        int i2 = fsb.LJLIL;
        if (i == i2) {
            return 0;
        }
        if (i > i2) {
            return 1;
        }
        return -1;
    }

    public FSB(FutureTask futureTask, int i) {
        super(new ACallableS79S0101000_7(0, futureTask, 4));
        this.LJLIL = i;
    }
}

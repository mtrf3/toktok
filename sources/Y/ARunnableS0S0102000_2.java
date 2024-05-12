package Y;

import X.C169776lR;
import X.C169786lS;

/* loaded from: classes3.dex */
public class ARunnableS0S0102000_2 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S0102000_2 aRunnableS0S0102000_2) {
        C169776lR c169776lR = (C169776lR) aRunnableS0S0102000_2.l0;
        c169776lR.LJJII.LJJIJLIJ(aRunnableS0S0102000_2.i1, aRunnableS0S0102000_2.i2, false);
    }

    public static final void run$1(ARunnableS0S0102000_2 aRunnableS0S0102000_2) {
        C169786lS c169786lS = (C169786lS) aRunnableS0S0102000_2.l0;
        c169786lS.LJIL.LJJIJLIJ(aRunnableS0S0102000_2.i1, aRunnableS0S0102000_2.i2, false);
    }

    public ARunnableS0S0102000_2(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}

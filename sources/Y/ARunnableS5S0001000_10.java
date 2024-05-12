package Y;

import X.C56662Kg;
import X.C63276OsS;
import X.C63501Ow5;
import X.C63502Ow6;
import X.C89453Z8v;
import X.NPQ;
import com.ss.android.ugc.aweme.live.Live;

/* loaded from: classes11.dex */
public class ARunnableS5S0001000_10 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS5S0001000_10 aRunnableS5S0001000_10) {
        switch (aRunnableS5S0001000_10.i0) {
            case 0:
                NPQ.LIZIZ.LJ(null);
                return;
            default:
                C56662Kg.LIZ().LIZJ("method_lighten_preload_value", false);
                C56662Kg.LIZ().LJFF("method_lighten_preload_value", false);
                return;
        }
    }

    public static final void run$1(ARunnableS5S0001000_10 aRunnableS5S0001000_10) {
        switch (aRunnableS5S0001000_10.i0) {
            case 0:
                return;
            default:
                Live.lambda$getServiceInternal$3();
                return;
        }
    }

    public static final void run$2(ARunnableS5S0001000_10 aRunnableS5S0001000_10) {
        boolean LIZ;
        try {
            C63276OsS c63276OsS = new C63276OsS();
            int i = aRunnableS5S0001000_10.i0;
            C63502Ow6 build = new C63501Ow5().build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJIFFI = build;
            c63276OsS.LJIIJJI(i, c89453Z8v.build(), null, new Object[0]);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0001000_10(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}

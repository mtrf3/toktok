package Y;

import X.C31012CFc;
import X.C77583Ucd;
import X.U66;
import X.UA7;
import X.UA9;
import X.UC0;

/* loaded from: classes14.dex */
public class ARunnableS4S1110000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final void run$0(ARunnableS4S1110000_13 aRunnableS4S1110000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new UA7((U66) aRunnableS4S1110000_13.l1, aRunnableS4S1110000_13.s0, UC0.LJIJI((U66) aRunnableS4S1110000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), aRunnableS4S1110000_13.z2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S1110000_13 aRunnableS4S1110000_13) {
        boolean LIZ;
        try {
            ((C77583Ucd) aRunnableS4S1110000_13.l1).LJ(aRunnableS4S1110000_13.s0, aRunnableS4S1110000_13.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S1110000_13(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}

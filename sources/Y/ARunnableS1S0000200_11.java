package Y;

import J.N;
import X.HandlerThreadC65936PuG;
import X.RunnableC66042Pvy;

/* loaded from: classes12.dex */
public class ARunnableS1S0000200_11 implements Runnable {
    public final int $t;
    public long j0;
    public long j1;

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

    public static final void run$0(ARunnableS1S0000200_11 aRunnableS1S0000200_11) {
        boolean LIZ;
        try {
            long j = aRunnableS1S0000200_11.j0;
            long j2 = aRunnableS1S0000200_11.j1;
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.post(new RunnableC66042Pvy(j, j2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0000200_11 aRunnableS1S0000200_11) {
        boolean LIZ;
        try {
            N.M3RaWo13(aRunnableS1S0000200_11.j0, aRunnableS1S0000200_11.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0000200_11(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}

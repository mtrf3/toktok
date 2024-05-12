package Y;

import X.X3P;

/* loaded from: classes16.dex */
public class ARunnableS7S0001000_15 implements Runnable {
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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS7S0001000_15 aRunnableS7S0001000_15) {
        boolean LIZ;
        try {
            X3P.LIZ().cancelNotification(aRunnableS7S0001000_15.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0001000_15 aRunnableS7S0001000_15) {
        boolean LIZ;
        try {
            X3P.LIZ().cancelNotification(aRunnableS7S0001000_15.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0001000_15(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}

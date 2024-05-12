package Y;

import X.C2MZ;
import X.C57122Ma;

/* loaded from: classes2.dex */
public class ARunnableS0S0010000_1 implements Runnable {
    public final int $t;
    public boolean z0;

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

    public ARunnableS0S0010000_1(int i) {
        this.$t = i;
        this.z0 = false;
    }

    public static final void run$0(ARunnableS0S0010000_1 aRunnableS0S0010000_1) {
        boolean LIZ;
        try {
            C57122Ma.LIZ().edit().putBoolean("hasSwipedUp", aRunnableS0S0010000_1.z0).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0010000_1 aRunnableS0S0010000_1) {
        boolean LIZ;
        try {
            C2MZ.LIZIZ().edit().putBoolean("shouldShowSwipeUpGuide1", aRunnableS0S0010000_1.z0).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0010000_1(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}

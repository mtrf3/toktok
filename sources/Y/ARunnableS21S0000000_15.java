package Y;

import X.X3C;
import android.os.Process;

/* loaded from: classes16.dex */
public class ARunnableS21S0000000_15 implements Runnable {
    public final int $t;

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

    public ARunnableS21S0000000_15(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS21S0000000_15 aRunnableS21S0000000_15) {
        boolean LIZ;
        try {
            X3C.LIZ(true).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS21S0000000_15 aRunnableS21S0000000_15) {
        try {
            Process.setThreadPriority(10);
        } catch (Throwable unused) {
        }
    }
}

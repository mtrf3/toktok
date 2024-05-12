package Y;

import X.C28268B7o;
import X.C61407O8d;
import X.C73943T0h;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;

/* loaded from: classes6.dex */
public class ARunnableS12S0000000_5 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                C61407O8d.LIZ();
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                BadPhonesCommonOptTask.lambda$preloadWatchWidgets$2();
                return;
            case 3:
                BadPhonesCommonOptTask.lambda$preloadConfigs$3();
                return;
            default:
                return;
        }
    }

    public ARunnableS12S0000000_5(int i) {
        this.$t = i;
    }

    public static final void run$1(ARunnableS12S0000000_5 aRunnableS12S0000000_5) {
        boolean LIZ;
        try {
            C73943T0h.LIZ().LIZIZ(new C28268B7o(34));
        } finally {
            if (LIZ) {
            }
        }
    }
}

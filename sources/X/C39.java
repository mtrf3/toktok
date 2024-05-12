package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;

/* loaded from: classes6.dex */
public final class C39 implements Runnable {
    public static final C39 LJLIL = new C39();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            B4U.LIZ().LJJIIZ(true);
            LivePerformanceManager LIZ2 = B4U.LIZ();
            if (LIZ2.LJLZ.enable) {
                Handler handler = LIZ2.LJLLLLLL;
                if (handler == null) {
                    handler = LIZ2.LJIJI();
                }
                handler.postDelayed(new ARunnableS41S0100000_5(LIZ2, 326), 1000L);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}

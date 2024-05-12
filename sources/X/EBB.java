package X;

import Y.ARunnableS13S0000000_6;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class EBB {
    public static volatile boolean LIZ;
    public static int LIZIZ;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static int LIZLLL = 0;
    public static final ARunnableS13S0000000_6 LJ = new ARunnableS13S0000000_6(37);

    public static void LIZ(long j) {
        Handler handler = C37179EiV.LJFF;
        handler.post(new ARunnableS13S0000000_6(35));
        handler.postDelayed(new ARunnableS13S0000000_6(36), j);
    }
}

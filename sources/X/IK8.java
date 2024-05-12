package X;

import Y.ARunnableS3S0001000_8;
import android.os.Handler;

/* loaded from: classes9.dex */
public final class IK8 {
    public static volatile boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C2U8.LIZ(new IK7());
    }

    public static void LIZIZ(int i) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS3S0001000_8(i, 0));
    }
}

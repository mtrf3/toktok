package X;

import android.os.Handler;

/* loaded from: classes15.dex */
public final class VIF {
    public static Handler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (VIF.class) {
                if (LIZ == null) {
                    LIZ = new Handler(C16880lQ.LLJJJJ());
                }
            }
        }
        return LIZ;
    }
}

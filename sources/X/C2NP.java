package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2NP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NP {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final Looper LIZIZ = C16880lQ.LLJJJJ();

    public static void LIZ(Runnable runnable) {
        if (Looper.myLooper() == LIZIZ) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }
}

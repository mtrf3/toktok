package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2NH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NH {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ(Runnable runnable) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }
}

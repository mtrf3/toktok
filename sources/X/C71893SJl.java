package X;

import android.os.Looper;

/* renamed from: X.SJl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71893SJl {
    public static void LIZ(Runnable runnable) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            runnable.run();
        } else {
            C2050382x.LIZ.execute(runnable);
        }
    }
}

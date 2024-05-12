package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.10C, reason: invalid class name */
/* loaded from: classes.dex */
public class C10C implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C58182Qc.LIZ.getClass();
        if (C58182Qc.LIZIZ) {
            if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
                new Handler(C16880lQ.LLJJJJ()).post(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        new Handler(C16880lQ.LLJJJJ()).post(runnable);
    }
}

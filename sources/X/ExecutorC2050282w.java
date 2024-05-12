package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.82w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC2050282w implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C16880lQ.LLLLIIIILLL() == this.LJLIL.getLooper().getThread()) {
            runnable.run();
        } else {
            this.LJLIL.post(runnable);
        }
    }
}

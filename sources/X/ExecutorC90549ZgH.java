package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.ZgH, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ExecutorC90549ZgH implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}

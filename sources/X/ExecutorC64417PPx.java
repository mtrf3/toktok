package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.PPx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC64417PPx implements Executor {
    public final Handler LJLIL;

    public ExecutorC64417PPx(Looper looper) {
        this.LJLIL = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.LJLIL.post(runnable)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" is shutting down");
        throw new RejectedExecutionException(X1D.LIZIZ(LIZ));
    }

    public ExecutorC64417PPx(Handler handler) {
        this.LJLIL = handler;
    }
}

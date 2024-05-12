package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Ql4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC67914Ql4 implements Executor {
    public final HandlerC67913Ql3 LJLIL;

    public ExecutorC67914Ql4(Looper looper) {
        this.LJLIL = new HandlerC67913Ql3(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}

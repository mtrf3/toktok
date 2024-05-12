package X;

import java.util.concurrent.Executor;

/* renamed from: X.IRj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ExecutorC46619IRj implements Executor {
    public final Executor LJLIL;

    public ExecutorC46619IRj(Executor executor) {
        this.LJLIL = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(new RunnableC46618IRi(runnable));
    }
}

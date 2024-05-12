package X;

import java.util.concurrent.Executor;

/* renamed from: X.QEx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC66679QEx implements Executor {
    public final Executor LJLIL;

    public ExecutorC66679QEx(Executor executor) {
        this.LJLIL = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        RunnableC66678QEw runnableC66678QEw = new RunnableC66678QEw(runnable, C16880lQ.LLLLIIIILLL());
        this.LJLIL.execute(runnableC66678QEw);
        C66677QEv c66677QEv = runnableC66678QEw.LJLJI;
        if (c66677QEv == null) {
            runnableC66678QEw.LJLILLLLZI = null;
            return;
        }
        throw c66677QEv;
    }
}

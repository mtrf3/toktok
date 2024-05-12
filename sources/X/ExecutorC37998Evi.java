package X;

import java.util.concurrent.Executor;

/* renamed from: X.Evi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC37998Evi implements Executor {
    public final /* synthetic */ C37996Evg LJLIL;

    public ExecutorC37998Evi(C37996Evg c37996Evg) {
        this.LJLIL = c37996Evg;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.LJLIL.post(runnable);
    }
}

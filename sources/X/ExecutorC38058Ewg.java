package X;

import java.util.concurrent.Executor;

/* renamed from: X.Ewg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC38058Ewg implements Executor {
    public final /* synthetic */ C38056Ewe LJLIL;

    public ExecutorC38058Ewg(C38056Ewe c38056Ewe) {
        this.LJLIL = c38056Ewe;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.LJLIL.post(runnable);
    }
}
